package com.twu.biblioteca;

import java.util.ArrayList;

public class BookList {
    //1. Populate a list of books
    //2. Create a method
    private ArrayList<Book> Books;
    public BookList(){
        Books = new ArrayList<Book>();
        Books.add(new Book("The Art of Computer Programming",2011));
        Books.add(new Book("Clean Code: A Handbook of Agile Software Craftsmanship",2008));
        Books.add(new Book("The Pragmatic Programmer: From Journeyman to Master",1999));
        Books.add(new Book("Cracking the Coding Interview: 189 Programming Questions and Solutions",2015));
    }
    public ArrayList<Book> getBooks() {
        return Books;
    }
  }

