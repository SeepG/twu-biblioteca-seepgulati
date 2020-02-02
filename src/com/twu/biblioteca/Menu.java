package com.twu.biblioteca;

public class Menu {
    public String GetMenu(){
        return "Please select an option to continue\n 1. List of books";
    }


    public String SelectOption(int option) {
        String optionOutput = "";

        switch (option){
            case 1:
                BookList bookList = new BookList();
                // prints book list
                for (Book book : bookList.getBooks()) {
                    optionOutput += " - " + book.getName() + " | " + book.getAuthor() + " | " + book.getPublicationYear() + "\n";
                }
                return optionOutput;
            default:
                throw new IllegalArgumentException("Invalid Option Chosen");
        }
    }
}