package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Movie {

    private int id;
    private String title;
    private String production;
    private String genre;
    private List<Actor> actorsIn;

    public List<Actor> getActorsIn() {
        return actorsIn;
    }


    public Movie(String title, String production, String genre) {
        this.title = title;
        this.production = production;
        this.genre = genre;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", production='" + production + '\'' +
                ", genre='" + genre + '\'' +
                ", actorsIn=" + actorsIn +
                '}';
    }
}