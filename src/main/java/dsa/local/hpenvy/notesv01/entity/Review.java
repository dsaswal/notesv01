package dsa.local.hpenvy.notesv01.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Objects;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String reviewTitle;
    private String reviewDescription;


    public Review() {
    }

    public Review(Long id, String reviewTitle, String reviewDescription) {
        this.id = id;
        this.reviewTitle = reviewTitle;
        this.reviewDescription = reviewDescription;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReviewTitle() {
        return this.reviewTitle;
    }

    public void setReviewTitle(String reviewTitle) {
        this.reviewTitle = reviewTitle;
    }

    public String getReviewDescription() {
        return this.reviewDescription;
    }

    public void setReviewDescription(String reviewDescription) {
        this.reviewDescription = reviewDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Review)) {
            return false;
        }
        Review review = (Review) o;
        return Objects.equals(id, review.id) && Objects.equals(reviewTitle, review.reviewTitle) && Objects.equals(reviewDescription, review.reviewDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, reviewTitle, reviewDescription);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", reviewTitle='" + getReviewTitle() + "'" +
            ", reviewDescription='" + getReviewDescription() + "'" +
            "}";
    }

}