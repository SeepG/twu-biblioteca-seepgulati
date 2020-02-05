package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckoutMovieTest {
    CheckoutMovie checkoutObject;
    @Before
    public void BeforeEachTest(){
        checkoutObject = new CheckoutMovie();
    }

    @Test
    public void CheckoutMovieTest(){
        Movie expectedOutput = new Movie("Art",1999, "Blah Blah",5);
        Movie actualOutput = checkoutObject.Checkout("Art");
        assertNotNull(actualOutput);
        assertEquals(expectedOutput.getMovieName(),actualOutput.getMovieName());
        assertEquals(expectedOutput.getMovieDirector(),actualOutput.getMovieDirector());
        assertEquals(expectedOutput.getMovieRating(),actualOutput.getMovieRating());
        assertEquals(expectedOutput.getMovieYear(),actualOutput.getMovieYear());
    }

    @Test
    public void CheckoutMovieDoesntExist(){
        Movie actualOutput = checkoutObject.Checkout("Life of Pi");
        assertNull(actualOutput);
    }

    @Test
    public void GetAvailableMoviesTest(){
        String expectedOutput = " - Art | 1999 | Blah Blah | 5\n" +
                " - Craft | 2016 | New | 3\n" +
                " - Life of nuts | 1956 | Who Knows | 2\n" +
                " - Cracking the egg | 1880 | Donald Trump | Unrated\n";
        String actualOutput = checkoutObject.GetAvailableMovies();
        assertEquals(expectedOutput,actualOutput);
    }
}