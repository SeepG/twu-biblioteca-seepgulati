package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MovieListTest {
    @Test
    public void returnsMovieDetailsTest() {
        ArrayList<Movie> expectedOutput = new ArrayList<Movie>();
        expectedOutput.add(new Movie("Art", 1999, "Blah Blah",5));
        expectedOutput.add(new Movie("Craft", 2016, "New",3));
        expectedOutput.add(new Movie("Life of nuts", 1956, "Who Knows",2));
        expectedOutput.add(new Movie("Cracking the egg", 1880, "Donald Trump",0));

        MovieList movielist = new MovieList();
        ArrayList<Movie> actualOutput = movielist.getMovies();

        assertEquals(expectedOutput.size(), actualOutput.size());
        for (int i = 0; i < actualOutput.size(); i++) {
            assertEquals(expectedOutput.get(i).getMovieName(), actualOutput.get(i).getMovieName());
            assertEquals(expectedOutput.get(i).getMovieYear(), actualOutput.get(i).getMovieYear());
            assertEquals(expectedOutput.get(i).getMovieDirector(), actualOutput.get(i).getMovieDirector());
            assertEquals(expectedOutput.get(i).getMovieRating(),actualOutput.get(i).getMovieRating());
        }
    }
}