package main.anton.menu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBuilder {

    private ActionListener exitListener;

    public MenuBuilder() {
        this.exitListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
    }

    public PopupMenu buildMenu() {
        PopupMenu menu = new PopupMenu();
        menu.add(addExit());
        return menu;
    }

    private MenuItem addExit() {
        MenuItem item = new MenuItem("Exit.");
        item.addActionListener(exitListener);
        return item;
    }
}
