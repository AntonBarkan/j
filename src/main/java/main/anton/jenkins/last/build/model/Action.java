
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
public class Action {

    @SerializedName("causes")
    @Expose
    @Valid
    private List<Cause> causes = new ArrayList<Cause>();
    @SerializedName("buildsByBranchName")
    @Expose
    @Valid
    private BuildsByBranchName buildsByBranchName;
    @SerializedName("lastBuiltRevision")
    @Expose
    @Valid
    private LastBuiltRevision lastBuiltRevision;
    @SerializedName("remoteUrls")
    @Expose
    @Valid
    private List<String> remoteUrls = new ArrayList<String>();
    @SerializedName("scmName")
    @Expose
    private String scmName;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Action() {
    }

    /**
     * 
     * @param scmName
     * @param buildsByBranchName
     * @param lastBuiltRevision
     * @param remoteUrls
     * @param causes
     */
    public Action(List<Cause> causes, BuildsByBranchName buildsByBranchName, LastBuiltRevision lastBuiltRevision, List<String> remoteUrls, String scmName) {
        this.causes = causes;
        this.buildsByBranchName = buildsByBranchName;
        this.lastBuiltRevision = lastBuiltRevision;
        this.remoteUrls = remoteUrls;
        this.scmName = scmName;
    }

    /**
     * 
     * @return
     *     The causes
     */
    public List<Cause> getCauses() {
        return causes;
    }

    /**
     * 
     * @param causes
     *     The causes
     */
    public void setCauses(List<Cause> causes) {
        this.causes = causes;
    }

    /**
     * 
     * @return
     *     The buildsByBranchName
     */
    public BuildsByBranchName getBuildsByBranchName() {
        return buildsByBranchName;
    }

    /**
     * 
     * @param buildsByBranchName
     *     The buildsByBranchName
     */
    public void setBuildsByBranchName(BuildsByBranchName buildsByBranchName) {
        this.buildsByBranchName = buildsByBranchName;
    }

    /**
     * 
     * @return
     *     The lastBuiltRevision
     */
    public LastBuiltRevision getLastBuiltRevision() {
        return lastBuiltRevision;
    }

    /**
     * 
     * @param lastBuiltRevision
     *     The lastBuiltRevision
     */
    public void setLastBuiltRevision(LastBuiltRevision lastBuiltRevision) {
        this.lastBuiltRevision = lastBuiltRevision;
    }

    /**
     * 
     * @return
     *     The remoteUrls
     */
    public List<String> getRemoteUrls() {
        return remoteUrls;
    }

    /**
     * 
     * @param remoteUrls
     *     The remoteUrls
     */
    public void setRemoteUrls(List<String> remoteUrls) {
        this.remoteUrls = remoteUrls;
    }

    /**
     * 
     * @return
     *     The scmName
     */
    public String getScmName() {
        return scmName;
    }

    /**
     * 
     * @param scmName
     *     The scmName
     */
    public void setScmName(String scmName) {
        this.scmName = scmName;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(causes).append(buildsByBranchName).append(lastBuiltRevision).append(remoteUrls).append(scmName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Action) == false) {
            return false;
        }
        Action rhs = ((Action) other);
        return new EqualsBuilder().append(causes, rhs.causes).append(buildsByBranchName, rhs.buildsByBranchName).append(lastBuiltRevision, rhs.lastBuiltRevision).append(remoteUrls, rhs.remoteUrls).append(scmName, rhs.scmName).isEquals();
    }

}
