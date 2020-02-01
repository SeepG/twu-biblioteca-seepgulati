package com.twu.biblioteca;

import java.util.ArrayList;

public class BookList {
    // Populate list of books
    // get books method
    private ArrayList<Book> Books;
    public BookList(){
        Books = new ArrayList<Book>();
        Books.add(new Book("The Art of Computer Programming","Donald Knuth", 2011));
        Books.add(new Book("Clean Code: A Handbook of Agile Software Craftsmanship","Robert Cecil Martin", 2008));
        Books.add(new Book("The Pragmatic Programmer: From Journeyman to Master","Andy Hunt and Dave Thomas",1999));
        Books.add(new Book("Cracking the Coding Interview: 189 Programming Questions and Solutions","Gayle Laakmann McDowell",2015));
    }
    public ArrayList<Book> getBooks() {
        return Books;
    }
  }

