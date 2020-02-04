package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {
    @Test
    public void ReturnMovieDetailsTest(){
        String expectedMovieName = "My Name is Anthony";
        Integer expectedMovieYear = 2020;
        String expectedMovieDirector = "BlahBlah";
        Integer expectedMovieRating = 1;
        Movie movie = new Movie(expectedMovieName, expectedMovieYear, expectedMovieDirector, expectedMovieRating);
        assertEquals(expectedMovieName,movie.getMovieName());
        assertEquals(expectedMovieYear,movie.getMovieYear());
        assertEquals(expectedMovieDirector,movie.getMovieDirector());
        assertEquals(expectedMovieRating,movie.getMovieRating());
        }
}