package dsa.local.hpenvy.notesv01.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Objects;

@Entity
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tagTitle;
    private String tagDescription;


    public Tag() {
    }

    public Tag(Long id, String tagTitle, String tagDescription) {
        this.id = id;
        this.tagTitle = tagTitle;
        this.tagDescription = tagDescription;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTagTitle() {
        return this.tagTitle;
    }

    public void setTagTitle(String tagTitle) {
        this.tagTitle = tagTitle;
    }

    public String getTagDescription() {
        return this.tagDescription;
    }

    public void setTagDescription(String tagDescription) {
        this.tagDescription = tagDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) o;
        return Objects.equals(id, tag.id) && Objects.equals(tagTitle, tag.tagTitle) && Objects.equals(tagDescription, tag.tagDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tagTitle, tagDescription);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", tagTitle='" + getTagTitle() + "'" +
            ", tagDescription='" + getTagDescription() + "'" +
            "}";
    }
    
}
