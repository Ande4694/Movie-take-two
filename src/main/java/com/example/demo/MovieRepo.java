package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepo {

    private List<Movie> movies = new ArrayList<>();
    private List<Movie> searched = new ArrayList<>();

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getSearched() {
        return searched;
    }

    public void setSearched(List<Movie> searched) {
        this.searched = searched;
    }
}
