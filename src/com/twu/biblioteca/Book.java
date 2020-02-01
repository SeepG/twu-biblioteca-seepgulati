package com.twu.biblioteca;

public class Book {

    private String Name;
    private Integer PublicationYear;

    //Constructor
    public Book(String name, Integer publicationYear){
        Name = name;
        PublicationYear = publicationYear;
    }

    public String getName() {
        return Name;
    }

    public Integer getPublicationYear() {
        return PublicationYear;
    }

}
