package main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import main.anton.jenkins.last.build.model.Action;
import main.anton.jenkins.last.build.model.Example;
import main.anton.menu.MenuBuilder;
import org.apache.commons.lang.StringUtils;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.*;
import java.util.stream.Collectors;

import static org.apache.commons.lang.StringUtils.*;

public class Main implements ActionListener {

    public static final String IMAGE_PREFIX = "src/main/resources/images/";

    private String title;
    private String message;
    private TrayIcon.MessageType messageType;


    public static void main(String[] args) throws InterruptedException {
        System.out.println(new File(".").getAbsoluteFile());
        MenuBuilder menuBuilder = new MenuBuilder();
        final TrayIcon greenIcon = createTrayIcon(IMAGE_PREFIX + "green.png", menuBuilder.buildMenu());
        final TrayIcon yellowIcon = createTrayIcon(IMAGE_PREFIX + "yellow.png", menuBuilder.buildMenu());
        final TrayIcon redIcon = createTrayIcon(IMAGE_PREFIX + "red.png", menuBuilder.buildMenu());
        final TrayIcon greyIcon = createTrayIcon(IMAGE_PREFIX + "grey.png", menuBuilder.buildMenu());
        final TrayIcon noConnect = createTrayIcon(IMAGE_PREFIX + "connect_no.png", menuBuilder.buildMenu());



        SystemTray tray = SystemTray.getSystemTray();

        try {
            addIconAndShowMessage(tray, greyIcon, "!", null, TrayIcon.MessageType.INFO);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        Thread t = new Thread(() -> {
            try {
                while (true) {
                    try {

                        URL url = new URL("http://bdmsapp:6080/view/bdms.trunk/job/bdms-ci-trunk/lastCompletedBuild/api/json");
                        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                        conn.setRequestMethod("GET");
                        conn.setRequestProperty("Accept", "application/json");
                        if (conn.getResponseCode() != 200) {

                        }
                        String json = "";
                        try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                            String output;
                            while ((output = br.readLine()) != null) {
                                json += output;
                            }
                            final GsonBuilder builder = new GsonBuilder();
                            final Gson gson = builder.create();
                            final Example example = gson.fromJson(json, Example.class);
                            switch (example.getResult()) {
                                case "FAILURE":
                                    changeTryIcon(tray, redIcon, "Last commiters : ", getBuildCommiters(example), TrayIcon.MessageType.ERROR);
                                    break;
                                case "UNSTABLE":
                                    changeTryIcon(tray, yellowIcon, "Last commiters : ", getBuildCommiters(example), TrayIcon.MessageType.ERROR);
                                    break;
                                case "SUCCESS":
                                    changeTryIcon(tray, greenIcon, "!", null, TrayIcon.MessageType.INFO);
                                    break;
                                case "ABORTED":
                                    changeTryIcon(tray, greyIcon, "oops", null, TrayIcon.MessageType.ERROR);
                                    break;
                            }
                        }
                    } catch (UnknownHostException| SocketException e){
                        changeTryIcon(tray, noConnect, "", "Can't connect to jenkins server.", TrayIcon.MessageType.ERROR);
                    }
                    Thread.sleep(10000);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        t.start();
        t.join();
    }

    private static String getBuildCommiters(Example example) {
        return example.getCulprits().stream().map(x -> x.getFullName()).collect(Collectors.joining("\n"));
    }

    private static void changeTryIcon(SystemTray tray, TrayIcon toIcon, String title, String message, TrayIcon.MessageType type) throws AWTException {
        TrayIcon trayIcon =  tray.getTrayIcons()[0];
        if (toIcon != trayIcon) {
            tray.remove(tray.getTrayIcons()[0]);
            addIconAndShowMessage(tray, toIcon, title, message, type);
        }
    }

    private static void addIconAndShowMessage(SystemTray tray, TrayIcon toIcon, String title, String message, TrayIcon.MessageType type) throws AWTException {
        tray.add(toIcon);
        if (isNotBlank(title) || isNotBlank(message)) {
            ((Main)toIcon.getActionListeners()[0]).title = title;
            ((Main)toIcon.getActionListeners()[0]).message = message;
            ((Main)toIcon.getActionListeners()[0]).messageType = type;
            toIcon.displayMessage(title, message, type);
        }
    }

    private static TrayIcon createTrayIcon(String iconName, PopupMenu tryMenu) {
        File f= new File(iconName);
        Image image = Toolkit.getDefaultToolkit().getImage(f.getAbsolutePath());
        TrayIcon trayIcon = new TrayIcon(image, "", tryMenu);
        trayIcon.addActionListener(new Main());
        return trayIcon;
    }

    public void actionPerformed(ActionEvent e) {
        ((TrayIcon)e.getSource()).displayMessage(title, message, messageType);
    }
}
