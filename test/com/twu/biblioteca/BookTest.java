package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    @Test
    //mock book test data
    public void TestBook(){
        String expectedBookName = "BookName";
        String expectedAuthor = "YouKnewThat";
        Integer expectedPublicationYear = 2020;

        Book book = new Book(expectedBookName, expectedAuthor,expectedPublicationYear);
        assertEquals(expectedBookName,book.getName());
        assertEquals(expectedPublicationYear,book.getPublicationYear());
    }

}