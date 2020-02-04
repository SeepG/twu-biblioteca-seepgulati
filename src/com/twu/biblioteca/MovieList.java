package com.twu.biblioteca;

import java.util.ArrayList;

public class MovieList {
        private ArrayList<Movie> Movies;
        public MovieList(){
            Movies = new ArrayList<Movie>();
            Movies.add(new Movie("Art",1999, "Blah Blah",5));
            Movies.add(new Movie("Craft",2016, "New",3));
            Movies.add(new Movie("Life of nuts",1956,"Who Knows",2));
            Movies.add(new Movie("Cracking the egg",1880,"Donald Trump",0));
        }
        public ArrayList<Movie> getMovies() {
            return Movies;
        }
}
