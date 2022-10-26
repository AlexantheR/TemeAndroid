package com.example.tema2;

import android.content.Intent;
import android.widget.DatePicker;

import java.util.Date;

enum Genre{
    HORROR, ACTION, COMEDY, ADVENTURE;
}

public class Movie {
    private String title;
    private Genre gen;
    private byte rating;
    private String release;
    private double budget;
    private String poster;
    private boolean seekable;
    private Date releaseDate;
    private Integer duration;

    public Movie(String title, Genre gen, byte rating, String release, double budget, String poster, boolean seekable, Date releaseDate, Integer duration) {
        this.title = title;
        this.gen = gen;
        this.rating = rating;
        this.release = release;
        this.budget = budget;
        this.poster = poster;
        this.seekable = seekable;
        this.releaseDate = releaseDate;
        this.duration = duration;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGen() {
        return gen;
    }

    public void setGen(Genre gen) {
        this.gen = gen;
    }

    public byte getRating() {
        return rating;
    }

    public void setRating(byte rating) {
        this.rating = rating;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public boolean isSeekable() {
        return seekable;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public boolean getSeekable() {
        return seekable;
    }

    public void setSeekable(boolean seekable) {
        this.seekable = seekable;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", gen=" + gen +
                ", rating=" + rating +
                ", release='" + release + '\'' +
                ", budget=" + budget +
                ", poster='" + poster + '\'' +
                ", seekable=" + seekable +
                ", releaseDate=" + releaseDate +
                ", duration=" + duration +
                '}';
    }
}
