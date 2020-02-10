package com.twu.biblioteca;

import java.util.ArrayList;

public class CheckoutMovie {
    public static final String ThankYouMessage = "Thank you! Enjoy the movie";
    public static final String ErrorMessage = "Sorry that movie is not available";
//    public static final String ThankYouReturnMessage = "Thank you for returning the movie"; no return functionality
//    public static final String ErrorReturnMessage = "This is not a valid movie to return";
    public static final String UnratedMovie = "Unrated";

    ArrayList<Movie> issuedMovies = new ArrayList<Movie>();// issued movie object
    ArrayList<Movie> availableMovies = new ArrayList<Movie>();//available movie object

    //Checkout movie method
    public Movie Checkout(String movieName){
        Movie checkedoutMovie = null;
        MovieList movieList = new MovieList();// movie list object
        ArrayList<Movie> allMovies = movieList.getMovies();//all movies is getting all movies via getMovies method
        if(FindMovieInMovieList(allMovies,movieName) && !FindMovieInMovieList(issuedMovies,movieName)) {
            for (Movie movie : movieList.getMovies()) {
                if(movie.getMovieName().equals(movieName)){
                    checkedoutMovie = movie;
                    issuedMovies.add(checkedoutMovie);
                    break;
                }
            }
        }
        return checkedoutMovie;
    }

//Available movie method displays list of available movies
    public String GetAvailableMovies(){
        availableMovies = new ArrayList<Movie>();
        MovieList movieList = new MovieList();
        for (Movie movie: movieList.getMovies()) {
           if(!FindMovieInMovieList(issuedMovies,movie.getMovieName())){
                availableMovies.add(movie);
           }
        }
        String optionOutput = "";
        for (Movie movie : availableMovies) {
            String rating = movie.getMovieRating().equals(0)?UnratedMovie:movie.getMovieRating().toString();
            optionOutput += " - " + movie.getMovieName() + " | " + movie.getMovieYear() + " | " + movie.getMovieDirector() + " | " + rating+ "\n";
        }
        //optionOutput+="Please enter a movie name to checkout or 0 to exit";
        return optionOutput;
    }
//Find method conducts search operation compares movielist with movie name
    public boolean FindMovieInMovieList(ArrayList<Movie> movieList, String movieName){
        //for each movieitem of movieList compare with checkout out movie name
        for(Movie movie : movieList){
            if(movie.getMovieName().equals(movieName)){
                return true;
            }
        }
        return false;
    }
}
