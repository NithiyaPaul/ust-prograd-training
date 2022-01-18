package com.example.onlineMovieTickets.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

@Entity
public class MovieShow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String showDate;
    private String startTime;
    @OneToOne
    private Theater theater;
    @OneToOne
    private Movie movie;

    public MovieShow() {
    }

    public MovieShow(Long id, String showDate, String startTime, Theater theater, Movie movie) {
        this.id = id;
        this.showDate = showDate;
        this.startTime = startTime;
        this.theater = theater;
        this.movie = movie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
