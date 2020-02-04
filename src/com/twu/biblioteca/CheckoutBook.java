package com.twu.biblioteca;

import java.util.ArrayList;

public class CheckoutBook {
    public static final String ThankYouMessage = "Thank you! Enjoy the book";
    public static final String AvailableBooksMessage = "Available Books";
    public static final String QuitPhrase = "quit";
    public static final String ErrorMessage = "Sorry that book is not available, please choose a book from the list or enter quit to exit";
    ArrayList<Book> issuedBooks = new ArrayList<Book>();// issued book object
    ArrayList<Book> availableBooks = new ArrayList<Book>();//available book object

    //Checkout book method
    public Book Checkout(String bookName){
        Book checkedoutBook = null;
        BookList bookList = new BookList();// booklist object
        ArrayList<Book> allBooks = bookList.getBooks();//allbooks is getting all books via getBooks method
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
    //Return book method

    public Book ReturnIssuedBook(String bookName){
        Book returnedBook = null;
        if(FindBookInBookList(issuedBooks,bookName)) {
            for (Book bookItem : issuedBooks) {
                if(bookItem.getName().equals(bookName)){
                    issuedBooks.remove(bookItem);
                    availableBooks.add(bookItem);
                    returnedBook = bookItem;
                    break;
                }
            }
        }
        return returnedBook;
    }

//Available book method displays list of available books
    public String GetAvailableBooks(){
        availableBooks = new ArrayList<Book>();
        BookList bookList = new BookList();
        for (Book book: bookList.getBooks()) {
           if(!FindBookInBookList(issuedBooks,book.getName())){
                availableBooks.add(book);
           }
        }
        String optionOutput = "";
        for (Book book : availableBooks) {
            optionOutput += " - " + book.getName() + " | " + book.getAuthor() + " | " + book.getPublicationYear() + "\n";
        }
        optionOutput+="Please enter another book name or enter quit to exit the application";
        return optionOutput;
    }
//Find method conducts search operation compares booklist with book name
    public boolean FindBookInBookList(ArrayList<Book> bookList, String bookName){
        //for each bookItem of booklist compare with checkout out book name
        for(Book book : bookList){
            if(book.getName().equals(bookName)){
                return true;
            }
        }
        return false;
    }
}
