package com.dsgrove.dsgrove.entities;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable


public class ScorePK implements Serializable {

    @ManyToOne
    @JoinColumn (name ="movie_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn (name ="user_id")
    private User user;


    public ScorePK(){
    }

    public Movie getMovie () {
        return movie;
    }

    public void setMovie (Movie movie) {
        this.movie = movie;
    }

    public User getUser () {
        return user;
    }

    public void setUser (User user) {
        this.user = user;
    }
}
