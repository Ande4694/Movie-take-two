package com.example.demo;

public class Genre {

    private int id;
    private int genre;

    public Genre(int id, int genre) {
        this.id = id;
        this.genre = genre;
    }

    public Genre() {
    }

    public int getId() {
        return id;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }
}
