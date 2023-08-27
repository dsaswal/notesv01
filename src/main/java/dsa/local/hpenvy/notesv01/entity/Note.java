package dsa.local.hpenvy.notesv01.entity;

import java.sql.Timestamp;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String details;
    private Timestamp createdTime;
    private Timestamp lastModifiedTime;
    @Version
    private Integer version;

    public Note() {
    }
    

    public Note(long id, String title, String details, Timestamp createdTime, Timestamp lastModifiedTime, Integer version) {
        this.id = id;
        this.title = title;
        this.details = details;
        this.createdTime = createdTime;
        this.lastModifiedTime = lastModifiedTime;
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

    public String getDetails() {
        return this.details;
    }

    public void setDetails(String details) {
        this.details = details;
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

    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Note id(long id) {
        setId(id);
        return this;
    }

    public Note title(String title) {
        setTitle(title);
        return this;
    }

    public Note details(String details) {
        setDetails(details);
        return this;
    }

    public Note createdTime(Timestamp createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    public Note lastModifiedTime(Timestamp lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    public Note version(Integer version) {
        setVersion(version);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Note)) {
            return false;
        }
        Note note = (Note) o;
        return id == note.id && Objects.equals(title, note.title) && Objects.equals(details, note.details) && Objects.equals(createdTime, note.createdTime) && Objects.equals(lastModifiedTime, note.lastModifiedTime) && Objects.equals(version, note.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, details, createdTime, lastModifiedTime, version);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", details='" + getDetails() + "'" +
            ", createdTime='" + getCreatedTime() + "'" +
            ", lastModifiedTime='" + getLastModifiedTime() + "'" +
            ", version='" + getVersion() + "'" +
            "}";
    }
    
}
