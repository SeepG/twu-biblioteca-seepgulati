package com.twu.biblioteca;

public class BibliotecaApp {
    public static void main(String[] args) {
        BibliotecaApp obj = new BibliotecaApp();
        System.out.println(obj.GetWelcomeMessage());
        BookList bookList = new BookList();
        for (Book book : bookList.getBooks()) {
            System.out.printf("Title: %s%n",book.getName());
            System.out.printf("Year: %s%n", book.getPublicationYear());
        }
    }
    public String GetWelcomeMessage(){
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }
}

