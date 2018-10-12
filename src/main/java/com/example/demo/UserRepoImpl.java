package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepoImpl implements MovieRepo {

    public List<Movie> movies = new ArrayList<>();
    public List<Movie> searched = new ArrayList<>();


    @Override
    public List<Movie> findAll() {
        return movies;
    }

    @Override
    public void save(Movie movie) {
        movies.add(movie);
    }

    @Override
    public String toString() {
        return "UserRepoImpl{" +
                "movies=" + movies +
                ", searched=" + searched +
                '}';
    }

    public void addToSearched(Movie movie){
        searched.add(movie);
    }

    public List<Movie> getMovies() {
        return movies;
    }


    public List<Movie> getSearched() {
        return searched;
    }

}
