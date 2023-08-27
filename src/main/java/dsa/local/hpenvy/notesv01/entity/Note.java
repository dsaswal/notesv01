package dsa.local.hpenvy.notesv01.entity;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Version;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Note {

    private static final Logger logger = LoggerFactory.getLogger(Note.class);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String note;
    private Timestamp createdTime;
    private Timestamp lastModifiedTime;
    @OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Tag> tags;
    @OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Topic> topics;
    @OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Review> reviews;
    @Version
    private Integer version;

    @PrePersist
    protected void onCreate() {
        createdTime = new Timestamp(System.currentTimeMillis());
    }

    @PreUpdate
    protected void onUpdate() {
        lastModifiedTime = new Timestamp(System.currentTimeMillis());
        logger.debug("#################-in-pre-update");
        // version = version++;
        logger.debug("#################-" + this.toString());
    }


    public Note() {
    }

    public Note(long id, String title, String note, Timestamp createdTime, Timestamp lastModifiedTime, List<Tag> tags, List<Topic> topics, List<Review> reviews, Integer version) {
        this.id = id;
        this.title = title;
        this.note = note;
        this.createdTime = createdTime;
        this.lastModifiedTime = lastModifiedTime;
        this.tags = tags;
        this.topics = topics;
        this.reviews = reviews;
        this.version = version;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Timestamp getCreatedTime() {
        return this.createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    public Timestamp getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public void setLastModifiedTime(Timestamp lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Topic> getTopics() {
        return this.topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public List<Review> getReviews() {
        return this.reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Note)) {
            return false;
        }
        Note note = (Note) o;
        return id == note.id && Objects.equals(title, note.title) && Objects.equals(note, note.note) && Objects.equals(createdTime, note.createdTime) && Objects.equals(lastModifiedTime, note.lastModifiedTime) && Objects.equals(tags, note.tags) && Objects.equals(topics, note.topics) && Objects.equals(reviews, note.reviews) && Objects.equals(version, note.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, note, createdTime, lastModifiedTime, tags, topics, reviews, version);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", note='" + getNote() + "'" +
            ", createdTime='" + getCreatedTime() + "'" +
            ", lastModifiedTime='" + getLastModifiedTime() + "'" +
            ", tags='" + getTags() + "'" +
            ", topics='" + getTopics() + "'" +
            ", reviews='" + getReviews() + "'" +
            ", version='" + getVersion() + "'" +
            "}";
    }
    
}
