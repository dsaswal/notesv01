package dsa.local.hpenvy.notesv01.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Objects;

@Entity
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String topicTitle;
    private String topicDescription;


    public Topic() {
    }

    public Topic(Long id, String topicTitle, String topicDescription) {
        this.id = id;
        this.topicTitle = topicTitle;
        this.topicDescription = topicDescription;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopicTitle() {
        return this.topicTitle;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }

    public String getTopicDescription() {
        return this.topicDescription;
    }

    public void setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Topic)) {
            return false;
        }
        Topic topic = (Topic) o;
        return Objects.equals(id, topic.id) && Objects.equals(topicTitle, topic.topicTitle) && Objects.equals(topicDescription, topic.topicDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, topicTitle, topicDescription);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", topicTitle='" + getTopicTitle() + "'" +
            ", topicDescription='" + getTopicDescription() + "'" +
            "}";
    }

}
