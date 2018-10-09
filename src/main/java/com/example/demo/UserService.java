package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {

    @Autowired
    UserRepoImpl userRepo;


    public UserService() {
    }

    // set
    public void setMovie(){
        // hvilken film skal settes?

        // evt select?

        // set på alle attributer



    }

    // create
    public void create(Movie movie){
        userRepo.save(movie);
    }

    // delete
    public void delete(Movie movie){
        userRepo.getMovies().remove(movie);
    }

    // search by title
    public ArrayList<Movie> searchByTitle(String title){

        //gå gennem movies og gem alt der matcher i searched
        for (int i = 0; i<userRepo.getMovies().size();i++){

            if(userRepo.getMovies().get(i).getTitle().contains(title)){
                userRepo.getSearched().add(userRepo.getMovies().get(i));
            }
            return userRepo.getSearched();
        }

        return userRepo.getSearched();
    }

    // search by production year
    public ArrayList<Movie> searchByYear(String year){

        //gå gennem movies og gem alt der matcher i searched
        for (int i = 0; i<userRepo.getMovies().size();i++){

            if(userRepo.getMovies().get(i).getProduction().contains(year)){
                userRepo.getSearched().add(userRepo.getMovies().get(i));
            }
            return userRepo.getSearched();
        }

        return userRepo.getSearched();
    }

    // search by production genre
    public ArrayList<Movie> searchByGenre(String genre){

        //gå gennem movies og gem alt der matcher i searched
        for (int i = 0; i<userRepo.getMovies().size();i++){

            if(userRepo.getMovies().get(i).getGenre().contains(genre)){
                userRepo.getSearched().add(userRepo.getMovies().get(i));
            }
            return userRepo.getSearched();
        }

        return userRepo.getSearched();
    }

    // search by actors
    public ArrayList<Movie> searchByActor(String actor){

        //gå gennem movies og gem alt der matcher i searched
        for (int i = 0; i<userRepo.getMovies().size();i++){

            if(userRepo.getMovies().get(i).getActorsIn().contains(actor)){
                userRepo.getSearched().add(userRepo.getMovies().get(i));
            }
            return userRepo.getSearched();
        }

        return userRepo.getSearched();
    }

    // clear search, skal bruges før hvert nyt search
    public void clearSearch(){

            userRepo.getSearched().clear();
    }

    // get all
    public ArrayList<Movie> getMovies(){

        return userRepo.getMovies();

    }

    // get searched
    public ArrayList<Movie> getSearched(){

        return userRepo.getSearched();

    }


}
