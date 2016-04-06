
package main.anton.jenkins.last.build.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Author {

    @SerializedName("absoluteUrl")
    @Expose
    private String absoluteUrl;
    @SerializedName("fullName")
    @Expose
    private String fullName;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Author() {
    }

    /**
     * 
     * @param fullName
     * @param absoluteUrl
     */
    public Author(String absoluteUrl, String fullName) {
        this.absoluteUrl = absoluteUrl;
        this.fullName = fullName;
    }

    /**
     * 
     * @return
     *     The absoluteUrl
     */
    public String getAbsoluteUrl() {
        return absoluteUrl;
    }

    /**
     * 
     * @param absoluteUrl
     *     The absoluteUrl
     */
    public void setAbsoluteUrl(String absoluteUrl) {
        this.absoluteUrl = absoluteUrl;
    }

    /**
     * 
     * @return
     *     The fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 
     * @param fullName
     *     The fullName
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(absoluteUrl).append(fullName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Author) == false) {
            return false;
        }
        Author rhs = ((Author) other);
        return new EqualsBuilder().append(absoluteUrl, rhs.absoluteUrl).append(fullName, rhs.fullName).isEquals();
    }

}
