package com.twu.biblioteca;

public class BibliotecaApp {
    public static void main(String[] args) {
        BibliotecaApp obj = new BibliotecaApp();
        System.out.println(obj.GetWelcomeMessage());
        BookList bookList = new BookList();
        // Showing books list via getBooks method
        for (Book book : bookList.getBooks()) {
            System.out.println(" - " + book.getName() + " | " + book.getAuthor() + " | " + book.getPublicationYear());
        }
    }
    public String GetWelcomeMessage(){
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }
}

