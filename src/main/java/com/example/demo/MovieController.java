package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Repository;



import java.util.List;
import java.util.logging.Logger;

@Controller
public class MovieController {

    private final Logger log = Logger.getLogger(MovieController.class.getName());






    @Autowired
    private UserService userService;



    @GetMapping("")
    public String home(){

        log.info("Index called");


        return "index";
    }


    @GetMapping("/aboutUs")
    public String aboutUs(){

        log.info("about us called");

        return "aboutUs";
    }

    @GetMapping("/contact")
    public String contact(){

        log.info("contact called");

        return "contact";
    }

    @GetMapping("/create")
    public String create(Model model){

        log.info("create called");
        model.addAttribute("movie", new Movie());
        // "movie" er nøglen der defineres i create.html på linie 12
        // og bruges til at optage/modtage data ved submit på L. 15, 17 & 19


        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Movie movie){


        log.info("some monkey is trying to create some shitty movie");

        userService.create(movie);


        return "redirect:/movie";
    }

    @PostMapping ("/search/{title}")
    public String search(@PathVariable("title") Model model, String title){

        //userService.searchByTitle(movie);
        log.info("some monkey managed to search something: "+title);
        userService.clearSearch();
        model.addAttribute("title", userService.searchByTitle(title));




        return "redirect:/search";
    }

    @GetMapping("/result")
    public String result(Model model){

        log.info("some monkey called search");
        userService.searchByTitle(userService.inputData.getInput());
        List<Movie> searchList = userService.getSearched();
        model.addAttribute("Searched", searchList);

        return "result";
    }

    @GetMapping("/movie")
    public String movie(Model model){
        List<Movie> movieList = userService.getMovies();
        model.addAttribute("Movies", movieList);
        //Movies er nøglen
        // inde i movie.html 129 er Movies nøglen til at få det ind
        // og "movie" er til for each loopet

        log.info("movie called");

        return "movie";
    }



}
