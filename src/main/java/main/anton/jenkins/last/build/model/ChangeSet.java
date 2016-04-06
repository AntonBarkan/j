
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
public class ChangeSet {

    @SerializedName("items")
    @Expose
    @Valid
    private List<Item> items = new ArrayList<Item>();
    @SerializedName("kind")
    @Expose
    private String kind;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ChangeSet() {
    }

    /**
     * 
     * @param items
     * @param kind
     */
    public ChangeSet(List<Item> items, String kind) {
        this.items = items;
        this.kind = kind;
    }

    /**
     * 
     * @return
     *     The items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * 
     * @param items
     *     The items
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * 
     * @return
     *     The kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * 
     * @param kind
     *     The kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(items).append(kind).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChangeSet) == false) {
            return false;
        }
        ChangeSet rhs = ((ChangeSet) other);
        return new EqualsBuilder().append(items, rhs.items).append(kind, rhs.kind).isEquals();
    }

}
