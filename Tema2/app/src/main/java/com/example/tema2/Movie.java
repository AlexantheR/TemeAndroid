package com.example.tema2;

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
                '}';
    }
}
