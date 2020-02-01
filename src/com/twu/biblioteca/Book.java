package com.twu.biblioteca;

public class Book {

    private String Name;
    private String Author;
    private Integer PublicationYear;

    //Constructor
    public Book(String name, String author, Integer publicationYear){
        Name = name;
        Author = author;
        PublicationYear = publicationYear;
    }

    public String getName() {
        return Name;
    }

    public String getAuthor() {
        return Author;
    }
    public Integer getPublicationYear() {
        return PublicationYear;
    }

}
