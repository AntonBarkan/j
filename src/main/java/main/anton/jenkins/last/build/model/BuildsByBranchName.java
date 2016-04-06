
package main.anton.jenkins.last.build.model;

import javax.annotation.Generated;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class BuildsByBranchName {

    @SerializedName("refs/remotes/origin/master")
    @Expose
    @Valid
    private RefsRemotesOriginMaster refsRemotesOriginMaster;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BuildsByBranchName() {
    }

    /**
     * 
     * @param refsRemotesOriginMaster
     */
    public BuildsByBranchName(RefsRemotesOriginMaster refsRemotesOriginMaster) {
        this.refsRemotesOriginMaster = refsRemotesOriginMaster;
    }

    /**
     * 
     * @return
     *     The refsRemotesOriginMaster
     */
    public RefsRemotesOriginMaster getRefsRemotesOriginMaster() {
        return refsRemotesOriginMaster;
    }

    /**
     * 
     * @param refsRemotesOriginMaster
     *     The refs/remotes/origin/master
     */
    public void setRefsRemotesOriginMaster(RefsRemotesOriginMaster refsRemotesOriginMaster) {
        this.refsRemotesOriginMaster = refsRemotesOriginMaster;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(refsRemotesOriginMaster).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BuildsByBranchName) == false) {
            return false;
        }
        BuildsByBranchName rhs = ((BuildsByBranchName) other);
        return new EqualsBuilder().append(refsRemotesOriginMaster, rhs.refsRemotesOriginMaster).isEquals();
    }

}
