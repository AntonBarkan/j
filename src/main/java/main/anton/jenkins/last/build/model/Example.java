
package main.anton.jenkins.last.build.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Example {

    @SerializedName("actions")
    @Expose
    @Valid
    private List<Action> actions = new ArrayList<Action>();
    @SerializedName("artifacts")
    @Expose
    @Valid
    private List<Object> artifacts = new ArrayList<Object>();
    @SerializedName("building")
    @Expose
    private Boolean building;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("duration")
    @Expose
    private Long duration;
    @SerializedName("estimatedDuration")
    @Expose
    private Long estimatedDuration;
    @SerializedName("executor")
    @Expose
    @Valid
    private Executor executor;
    @SerializedName("fullDisplayName")
    @Expose
    private String fullDisplayName;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("keepLog")
    @Expose
    private Boolean keepLog;
    @SerializedName("number")
    @Expose
    private Long number;
    @SerializedName("result")
    @Expose
    private String result;
    @SerializedName("timestamp")
    @Expose
    private Long timestamp;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("builtOn")
    @Expose
    private String builtOn;
    @SerializedName("changeSet")
    @Expose
    @Valid
    private ChangeSet changeSet;
    @SerializedName("culprits")
    @Expose
    @Valid
    private List<Culprit> culprits = new ArrayList<Culprit>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Example() {
    }

    /**
     * 
     * @param result
     * @param building
     * @param executor
     * @param number
     * @param builtOn
     * @param url
     * @param artifacts
     * @param timestamp
     * @param estimatedDuration
     * @param id
     * @param duration
     * @param fullDisplayName
     * @param keepLog
     * @param culprits
     * @param changeSet
     * @param description
     * @param actions
     */
    public Example(List<Action> actions, List<Object> artifacts, Boolean building, Object description, Long duration, Long estimatedDuration, Executor executor, String fullDisplayName, String id, Boolean keepLog, Long number, String result, Long timestamp, String url, String builtOn, ChangeSet changeSet, List<Culprit> culprits) {
        this.actions = actions;
        this.artifacts = artifacts;
        this.building = building;
        this.description = description;
        this.duration = duration;
        this.estimatedDuration = estimatedDuration;
        this.executor = executor;
        this.fullDisplayName = fullDisplayName;
        this.id = id;
        this.keepLog = keepLog;
        this.number = number;
        this.result = result;
        this.timestamp = timestamp;
        this.url = url;
        this.builtOn = builtOn;
        this.changeSet = changeSet;
        this.culprits = culprits;
    }

    /**
     * 
     * @return
     *     The actions
     */
    public List<Action> getActions() {
        return actions;
    }

    /**
     * 
     * @param actions
     *     The actions
     */
    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    /**
     * 
     * @return
     *     The artifacts
     */
    public List<Object> getArtifacts() {
        return artifacts;
    }

    /**
     * 
     * @param artifacts
     *     The artifacts
     */
    public void setArtifacts(List<Object> artifacts) {
        this.artifacts = artifacts;
    }

    /**
     * 
     * @return
     *     The building
     */
    public Boolean getBuilding() {
        return building;
    }

    /**
     * 
     * @param building
     *     The building
     */
    public void setBuilding(Boolean building) {
        this.building = building;
    }

    /**
     * 
     * @return
     *     The description
     */
    public Object getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(Object description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The duration
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * 
     * @return
     *     The estimatedDuration
     */
    public Long getEstimatedDuration() {
        return estimatedDuration;
    }

    /**
     * 
     * @param estimatedDuration
     *     The estimatedDuration
     */
    public void setEstimatedDuration(Long estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    /**
     * 
     * @return
     *     The executor
     */
    public Executor getExecutor() {
        return executor;
    }

    /**
     * 
     * @param executor
     *     The executor
     */
    public void setExecutor(Executor executor) {
        this.executor = executor;
    }

    /**
     * 
     * @return
     *     The fullDisplayName
     */
    public String getFullDisplayName() {
        return fullDisplayName;
    }

    /**
     * 
     * @param fullDisplayName
     *     The fullDisplayName
     */
    public void setFullDisplayName(String fullDisplayName) {
        this.fullDisplayName = fullDisplayName;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The keepLog
     */
    public Boolean getKeepLog() {
        return keepLog;
    }

    /**
     * 
     * @param keepLog
     *     The keepLog
     */
    public void setKeepLog(Boolean keepLog) {
        this.keepLog = keepLog;
    }

    /**
     * 
     * @return
     *     The number
     */
    public Long getNumber() {
        return number;
    }

    /**
     * 
     * @param number
     *     The number
     */
    public void setNumber(Long number) {
        this.number = number;
    }

    /**
     * 
     * @return
     *     The result
     */
    public String getResult() {
        return result;
    }

    /**
     * 
     * @param result
     *     The result
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * 
     * @return
     *     The timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * @param timestamp
     *     The timestamp
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The builtOn
     */
    public String getBuiltOn() {
        return builtOn;
    }

    /**
     * 
     * @param builtOn
     *     The builtOn
     */
    public void setBuiltOn(String builtOn) {
        this.builtOn = builtOn;
    }

    /**
     * 
     * @return
     *     The changeSet
     */
    public ChangeSet getChangeSet() {
        return changeSet;
    }

    /**
     * 
     * @param changeSet
     *     The changeSet
     */
    public void setChangeSet(ChangeSet changeSet) {
        this.changeSet = changeSet;
    }

    /**
     * 
     * @return
     *     The culprits
     */
    public List<Culprit> getCulprits() {
        return culprits;
    }

    /**
     * 
     * @param culprits
     *     The culprits
     */
    public void setCulprits(List<Culprit> culprits) {
        this.culprits = culprits;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(actions).append(artifacts).append(building).append(description).append(duration).append(estimatedDuration).append(executor).append(fullDisplayName).append(id).append(keepLog).append(number).append(result).append(timestamp).append(url).append(builtOn).append(changeSet).append(culprits).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Example) == false) {
            return false;
        }
        Example rhs = ((Example) other);
        return new EqualsBuilder().append(actions, rhs.actions).append(artifacts, rhs.artifacts).append(building, rhs.building).append(description, rhs.description).append(duration, rhs.duration).append(estimatedDuration, rhs.estimatedDuration).append(executor, rhs.executor).append(fullDisplayName, rhs.fullDisplayName).append(id, rhs.id).append(keepLog, rhs.keepLog).append(number, rhs.number).append(result, rhs.result).append(timestamp, rhs.timestamp).append(url, rhs.url).append(builtOn, rhs.builtOn).append(changeSet, rhs.changeSet).append(culprits, rhs.culprits).isEquals();
    }

}
