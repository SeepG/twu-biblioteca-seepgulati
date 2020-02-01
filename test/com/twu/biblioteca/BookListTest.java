package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BookListTest {
    @Test
    public void testBookList() {
        ArrayList<Book> expectedOutput = new ArrayList<Book>();
        expectedOutput.add(new Book("The Art of Computer Programming",2011));
        expectedOutput.add(new Book("Clean Code: A Handbook of Agile Software Craftsmanship",2008));
        expectedOutput.add(new Book("The Pragmatic Programmer: From Journeyman to Master",1999));
        expectedOutput.add(new Book("Cracking the Coding Interview: 189 Programming Questions and Solutions",2015));

        BookList bookList = new BookList();
        ArrayList<Book> actualOutput = bookList.getBooks();
        assertNotNull(actualOutput);
        assertEquals(expectedOutput.size(),actualOutput.size());
        for (int i = 0; i < actualOutput.size(); i++) {
            assertEquals(expectedOutput.get(i).getName(),actualOutput.get(i).getName());
            assertEquals(expectedOutput.get(i).getPublicationYear(),actualOutput.get(i).getPublicationYear());
        }
    }

}