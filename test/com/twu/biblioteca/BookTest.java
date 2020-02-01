package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    @Test
    public void TestBook(){
        String expectedBookName = "BookName";
        Integer expectedPublicationYear = 2020;
        Book book = new Book(expectedBookName,expectedPublicationYear);
        assertEquals(expectedBookName,book.getName());
        assertEquals(expectedPublicationYear,book.getPublicationYear());
    }

}