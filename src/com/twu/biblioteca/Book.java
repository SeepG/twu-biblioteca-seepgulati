package com.twu.biblioteca;

   //state
public class Book {
    private String Name;
    private String Author;
    private Integer PublicationYear;

    //Constructor
    public Book(String Name, String Author, Integer publicationYear){
        this.Name = Name;
        this.Author = Author;
        this.PublicationYear = publicationYear;
    }
    // getters behaviour
    public String getName() {
        return this.Name;
    } //get book name
    public String getAuthor() {
        return this.Author;
    } //get book author
    public Integer getPublicationYear() {
        return this.PublicationYear;
    } //get book publication year

}
