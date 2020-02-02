package com.twu.biblioteca;

import java.util.ArrayList;

public class CheckoutBook {
    ArrayList<Book> issuedBooks = new ArrayList<Book>();
    ArrayList<Book> availableBooks = new ArrayList<Book>();

    public Book Checkout(String bookName){
        Book checkedoutBook = null;
        BookList bookList = new BookList();
        ArrayList<Book> allBooks = bookList.getBooks();
        if(FindBookInBookList(allBooks,bookName) && !FindBookInBookList(issuedBooks,bookName)) {
            for (Book book : bookList.getBooks()) {
                if(book.getName().equals(bookName)){
                    checkedoutBook = book;
                    issuedBooks.add(checkedoutBook);
                    break;
                }
            }
        }
        return checkedoutBook;
    }

    public String GetAvailableBooks(){
        BookList bookList = new BookList();
        for (Book book: bookList.getBooks()) {
           if(!FindBookInBookList(issuedBooks,book.getName())){
                availableBooks.add(book);
           }
        }
        String optionOutput = "";
        for (Book book : bookList.getBooks()) {
            optionOutput += " - " + book.getName() + " | " + book.getAuthor() + " | " + book.getPublicationYear() + "\n";
        }
        optionOutput+="Please enter a book name to checkout";
        return optionOutput;
    }

    public boolean FindBookInBookList(ArrayList<Book> bookList, String bookName){
        for(Book book : bookList){
            if(book.getName().equals(bookName)){
                return true;
            }
        }
        return false;
    }
}
