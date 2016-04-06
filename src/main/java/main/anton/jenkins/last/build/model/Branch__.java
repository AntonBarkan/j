
package main.anton.jenkins.last.build.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Branch__ {

    @SerializedName("SHA1")
    @Expose
    private String SHA1;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Branch__() {
    }

    /**
     * 
     * @param name
     * @param SHA1
     */
    public Branch__(String SHA1, String name) {
        this.SHA1 = SHA1;
        this.name = name;
    }

    /**
     * 
     * @return
     *     The SHA1
     */
    public String getSHA1() {
        return SHA1;
    }

    /**
     * 
     * @param SHA1
     *     The SHA1
     */
    public void setSHA1(String SHA1) {
        this.SHA1 = SHA1;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(SHA1).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Branch__) == false) {
            return false;
        }
        Branch__ rhs = ((Branch__) other);
        return new EqualsBuilder().append(SHA1, rhs.SHA1).append(name, rhs.name).isEquals();
    }

}
