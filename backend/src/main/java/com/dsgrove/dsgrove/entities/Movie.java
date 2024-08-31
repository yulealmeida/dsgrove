package com.dsgrove.dsgrove.entities;

import javax.persistence.*;

@Entity
@Table (name = "tb_movie")

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private Double score;
    private Integer count;
    private String image;

    public Movie () {
    }

    public Movie (long id, String title, Double score, Integer count, String image) {
        this.id = id;
        this.title = title;
        this.score = score;
        this.count = count;
        this.image = image;
    }

    public long getId () {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public Double getScore () {
        return score;
    }

    public void setScore (Double score) {
        this.score = score;
    }

    public Integer getCount () {
        return count;
    }

    public void setCount (Integer count) {
        this.count = count;
    }

    public String getImage () {
        return image;
    }

    public void setImage (String image) {
        this.image = image;
    }
}
