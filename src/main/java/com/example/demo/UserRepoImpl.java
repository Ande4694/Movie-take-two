package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepoImpl implements MovieRepo {

    private List<Movie> movies = new ArrayList<>();
    private List<Movie> searched = new ArrayList<>();


    @Override
    public List<Movie> findAll() {
        return movies;
    }

    @Override
    public void save(Movie movie) {
        movies.add(movie);
    }



    public List<Movie> getMovies() {
        return movies;
    }


    public List<Movie> getSearched() {
        return searched;
    }

}
