package com.twu.biblioteca;

//state

public class Movie {
    private String movieName;
    private Integer movieYear;
    private String movieDirector;
    private String movieRating;

    //constructor
    public Movie(String movieName, Integer movieYear, String movieDirector, String movieRating){
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.movieDirector = movieDirector;
        this.movieRating = movieRating;
    }

    // getters behaviour
    public String getMovieName() { return this.movieName; } //get movie name
    public Integer getMovieYear() { return this.movieYear; } // get movie year
    public String getMovieDirector() { return this.movieDirector; } //get movie director
    public String getMovieRating() { return this.movieRating; } // get movie rating
}
