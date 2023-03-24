package org.example.model;

import javax.persistence.*;

@Entity
@Table(name = "reviews")
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "score")

    private int score;
    @Column(name = "comment")

    private String comment;

    @ManyToOne
    private Book book;

    public Reviews() {
    }

    public Reviews(int score, String comment) {
        this.score = score;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Reviews{" +
                "id=" + id +
                ", score=" + score +
                ", comment='" + comment + '\'' +
                '}';
    }
}
