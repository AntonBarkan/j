
package main.anton.jenkins.last.build.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Path {

    @SerializedName("editType")
    @Expose
    private String editType;
    @SerializedName("file")
    @Expose
    private String file;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Path() {
    }

    /**
     * 
     * @param file
     * @param editType
     */
    public Path(String editType, String file) {
        this.editType = editType;
        this.file = file;
    }

    /**
     * 
     * @return
     *     The editType
     */
    public String getEditType() {
        return editType;
    }

    /**
     * 
     * @param editType
     *     The editType
     */
    public void setEditType(String editType) {
        this.editType = editType;
    }

    /**
     * 
     * @return
     *     The file
     */
    public String getFile() {
        return file;
    }

    /**
     * 
     * @param file
     *     The file
     */
    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(editType).append(file).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Path) == false) {
            return false;
        }
        Path rhs = ((Path) other);
        return new EqualsBuilder().append(editType, rhs.editType).append(file, rhs.file).isEquals();
    }

}
