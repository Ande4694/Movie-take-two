package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class UserService {

    @Autowired
    MovieRepo movieRepo;



    // create
    public void create(Movie movie){
        movieRepo.getMovies().add(movie);
    }

    // søger på titel og ligger det i "searched
    public List<Movie> searchByTitle(String title){

        for (int i = 0; i<movieRepo.getMovies().size();i++){
            if (movieRepo.getMovies().get(i).getTitle().toLowerCase().contains(title.toLowerCase())){
                movieRepo.getSearched().add(movieRepo.getMovies().get(i));
            }
        }

        return movieRepo.getSearched();
    }


    //ryder tidligere søgninger
    public void clearSearch(){
        movieRepo.getSearched().clear();
    }

    // get all
    public List<Movie> getMovies(){

        return movieRepo.getMovies();

    }

    // get searched
    public List<Movie> getSearched(){

        return movieRepo.getSearched();

    }


}
