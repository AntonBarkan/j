
package main.anton.jenkins.last.build.model;

import javax.annotation.Generated;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class RefsRemotesOriginMaster {

    @SerializedName("buildNumber")
    @Expose
    private Long buildNumber;
    @SerializedName("buildResult")
    @Expose
    private Object buildResult;
    @SerializedName("marked")
    @Expose
    @Valid
    private Marked marked;
    @SerializedName("revision")
    @Expose
    @Valid
    private Revision revision;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RefsRemotesOriginMaster() {
    }

    /**
     * 
     * @param revision
     * @param marked
     * @param buildNumber
     * @param buildResult
     */
    public RefsRemotesOriginMaster(Long buildNumber, Object buildResult, Marked marked, Revision revision) {
        this.buildNumber = buildNumber;
        this.buildResult = buildResult;
        this.marked = marked;
        this.revision = revision;
    }

    /**
     * 
     * @return
     *     The buildNumber
     */
    public Long getBuildNumber() {
        return buildNumber;
    }

    /**
     * 
     * @param buildNumber
     *     The buildNumber
     */
    public void setBuildNumber(Long buildNumber) {
        this.buildNumber = buildNumber;
    }

    /**
     * 
     * @return
     *     The buildResult
     */
    public Object getBuildResult() {
        return buildResult;
    }

    /**
     * 
     * @param buildResult
     *     The buildResult
     */
    public void setBuildResult(Object buildResult) {
        this.buildResult = buildResult;
    }

    /**
     * 
     * @return
     *     The marked
     */
    public Marked getMarked() {
        return marked;
    }

    /**
     * 
     * @param marked
     *     The marked
     */
    public void setMarked(Marked marked) {
        this.marked = marked;
    }

    /**
     * 
     * @return
     *     The revision
     */
    public Revision getRevision() {
        return revision;
    }

    /**
     * 
     * @param revision
     *     The revision
     */
    public void setRevision(Revision revision) {
        this.revision = revision;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(buildNumber).append(buildResult).append(marked).append(revision).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefsRemotesOriginMaster) == false) {
            return false;
        }
        RefsRemotesOriginMaster rhs = ((RefsRemotesOriginMaster) other);
        return new EqualsBuilder().append(buildNumber, rhs.buildNumber).append(buildResult, rhs.buildResult).append(marked, rhs.marked).append(revision, rhs.revision).isEquals();
    }

}
