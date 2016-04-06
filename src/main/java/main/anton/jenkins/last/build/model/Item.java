
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
public class Item {

    @SerializedName("affectedPaths")
    @Expose
    @Valid
    private List<String> affectedPaths = new ArrayList<String>();
    @SerializedName("commitId")
    @Expose
    private String commitId;
    @SerializedName("timestamp")
    @Expose
    private Long timestamp;
    @SerializedName("author")
    @Expose
    @Valid
    private Author author;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("paths")
    @Expose
    @Valid
    private List<Path> paths = new ArrayList<Path>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param id
     * @param timestamp
     * @param author
     * @param paths
     * @param commitId
     * @param date
     * @param comment
     * @param msg
     * @param affectedPaths
     */
    public Item(List<String> affectedPaths, String commitId, Long timestamp, Author author, String comment, String date, String id, String msg, List<Path> paths) {
        this.affectedPaths = affectedPaths;
        this.commitId = commitId;
        this.timestamp = timestamp;
        this.author = author;
        this.comment = comment;
        this.date = date;
        this.id = id;
        this.msg = msg;
        this.paths = paths;
    }

    /**
     * 
     * @return
     *     The affectedPaths
     */
    public List<String> getAffectedPaths() {
        return affectedPaths;
    }

    /**
     * 
     * @param affectedPaths
     *     The affectedPaths
     */
    public void setAffectedPaths(List<String> affectedPaths) {
        this.affectedPaths = affectedPaths;
    }

    /**
     * 
     * @return
     *     The commitId
     */
    public String getCommitId() {
        return commitId;
    }

    /**
     * 
     * @param commitId
     *     The commitId
     */
    public void setCommitId(String commitId) {
        this.commitId = commitId;
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
     *     The author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * 
     * @param author
     *     The author
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * 
     * @return
     *     The comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * 
     * @param comment
     *     The comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 
     * @return
     *     The date
     */
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    public void setDate(String date) {
        this.date = date;
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
     *     The msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 
     * @param msg
     *     The msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 
     * @return
     *     The paths
     */
    public List<Path> getPaths() {
        return paths;
    }

    /**
     * 
     * @param paths
     *     The paths
     */
    public void setPaths(List<Path> paths) {
        this.paths = paths;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(affectedPaths).append(commitId).append(timestamp).append(author).append(comment).append(date).append(id).append(msg).append(paths).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Item) == false) {
            return false;
        }
        Item rhs = ((Item) other);
        return new EqualsBuilder().append(affectedPaths, rhs.affectedPaths).append(commitId, rhs.commitId).append(timestamp, rhs.timestamp).append(author, rhs.author).append(comment, rhs.comment).append(date, rhs.date).append(id, rhs.id).append(msg, rhs.msg).append(paths, rhs.paths).isEquals();
    }

}
