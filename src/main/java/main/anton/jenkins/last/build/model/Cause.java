
package main.anton.jenkins.last.build.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Cause {

    @SerializedName("shortDescription")
    @Expose
    private String shortDescription;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cause() {
    }

    /**
     * 
     * @param shortDescription
     */
    public Cause(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * 
     * @return
     *     The shortDescription
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * 
     * @param shortDescription
     *     The shortDescription
     */
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(shortDescription).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cause) == false) {
            return false;
        }
        Cause rhs = ((Cause) other);
        return new EqualsBuilder().append(shortDescription, rhs.shortDescription).isEquals();
    }

}
