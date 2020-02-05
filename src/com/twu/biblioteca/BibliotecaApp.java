package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {
    public String GetWelcomeMessage(){
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }

    public static void main(String[] args) {
        BibliotecaApp obj = new BibliotecaApp();
        Menu menuOptions = new Menu();
        CheckoutBook checkoutBook = new CheckoutBook();
        CheckoutMovie checkoutMovie = new CheckoutMovie();

        System.out.println(obj.GetWelcomeMessage());
        //display menu options - 1) List of books when selected leads to book list
        String optionOutput = ""; //initialising optionOutput to empty string so that it is not null


        while(!optionOutput.equals(Menu.QuitAppMessage)){
            if(!optionOutput.equals(Menu.InvalidOptionMessage)) {
                System.out.println(menuOptions.GetMenu()); //accessing getMenu return
            }
            Scanner input = new Scanner(System.in);//getting user input through Scanner
            String userOption = input.nextLine();//that captures string
            optionOutput = menuOptions.SelectOption(userOption);//accessing SelectOption and matching with User Input ?
            System.out.println(optionOutput);
            if(optionOutput.equals(Menu.ReturnOutputMessage)) {
                String bookName = input.nextLine();
                Book returnedBook = checkoutBook.ReturnIssuedBook(bookName);
                if (returnedBook != null) {
                    System.out.println(CheckoutBook.ThankYouReturnMessage);
                } else {
                    System.out.println(CheckoutBook.ErrorReturnMessage);
                }

            }
            else if(optionOutput.equals(Menu.CheckoutOutputMessage)){
                String availableBooks = checkoutBook.GetAvailableBooks();
                System.out.println(availableBooks);//list of available books
                String bookName = input.nextLine();
                Book checkedoutBook = checkoutBook.Checkout(bookName);
                if (checkedoutBook != null) {
                    System.out.println(CheckoutBook.ThankYouMessage);
                } else {
                    System.out.println(CheckoutBook.ErrorMessage);
                    //userOption = input.nextLine();
                }
            }
            else if(optionOutput.equals(Menu.CheckoutMovieOutputMessage)){
                String getAvailableMovies = checkoutMovie.GetAvailableMovies();
                System.out.println(getAvailableMovies);//list of available books
                String movieName = input.nextLine();
                Movie checkedoutMovie = checkoutMovie.Checkout(movieName);
                if (checkedoutMovie != null) {
                    System.out.println(CheckoutMovie.ThankYouMessage);
                } else {
                    System.out.println(CheckoutMovie.ErrorMessage);
                    //userOption = input.nextLine();
                }
            }
            //optionOutput = menuOptions.SelectOption(userOption);
        }


    }

}
