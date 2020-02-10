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
        UserProfile profile = new UserProfile("Seep","Seep@gmail.com",0401111111,"PassyPass","123-4567");

        System.out.println(obj.GetWelcomeMessage());
        String optionOutput = ""; //initialising optionOutput to empty string so that it is not null

// till quit message doesn't come, user is kept in while loop
        while(!optionOutput.equals(Menu.QuitAppMessage)){
            if(!optionOutput.equals(Menu.InvalidOptionMessage)) {
                System.out.println(menuOptions.GetMenu()); //accessing getMenu return
            }
            Scanner input = new Scanner(System.in);//getting user input through Scanner
            String userOption = input.nextLine();//that captures string
            optionOutput = menuOptions.SelectOption(userOption);//accessing SelectOption and matching with User Input ?

            if(optionOutput.equals(Menu.ReturnOutputMessage)) {
                if(Login(input,profile)) {
                    ReturnBook(checkoutBook, input, optionOutput);
                }
                else {
                    System.out.println(UserProfile.LoginError);
                }
            }
            else if(optionOutput.equals(Menu.CheckoutOutputMessage)){
                if(Login(input,profile)){
                CheckoutBook(checkoutBook, input, optionOutput);
                }
                else {
                    System.out.println(UserProfile.LoginError);
                }
            }
            else if(optionOutput.equals(Menu.CheckoutMovieOutputMessage)){
                if(Login(input,profile)) {
                    CheckoutMovie(checkoutMovie, input, optionOutput);
                }
                else {
                    System.out.println(UserProfile.LoginError);
                }
            }
        }


    }

    private static void CheckoutMovie(CheckoutMovie checkoutMovie, Scanner input, String optionOutput) {
        System.out.println(optionOutput);
        String getAvailableMovies = checkoutMovie.GetAvailableMovies();
        System.out.println(getAvailableMovies);//list of available books
        String movieName = input.nextLine();
        Movie checkedoutMovie = checkoutMovie.Checkout(movieName);
        if (checkedoutMovie != null) {
            System.out.println(CheckoutMovie.ThankYouMessage);
        } else {
            System.out.println(CheckoutMovie.ErrorMessage);
        }
    }

    private static void CheckoutBook(CheckoutBook checkoutBook, Scanner input, String optionOutput) {
        System.out.println(optionOutput);
        String availableBooks = checkoutBook.GetAvailableBooks();
        System.out.println(availableBooks);//list of available books
        String bookName = input.nextLine();// waiting for user input
        Book checkedoutBook = checkoutBook.Checkout(bookName);
        if (checkedoutBook != null) {
            System.out.println(CheckoutBook.ThankYouMessage);
        } else {
            System.out.println(CheckoutBook.ErrorMessage);// if null error message
        }
    }

    private static void ReturnBook(CheckoutBook checkoutBook, Scanner input, String optionOutput) {
        System.out.println(optionOutput);
        String bookName = input.nextLine();
        Book returnedBook = checkoutBook.ReturnIssuedBook(bookName);
        if (returnedBook != null) {
            System.out.println(CheckoutBook.ThankYouReturnMessage);
        } else {
            System.out.println(CheckoutBook.ErrorReturnMessage);
        }
    }

    private static boolean Login(Scanner input, UserProfile profile) {
        if(!profile.GetIsLoggedIn()) {
            System.out.println("Please login to continue");
            System.out.println("Library number");
            String username = input.nextLine();
            System.out.println("Password");
            String password = input.nextLine();
            return profile.Login(username, password);
        }
        return profile.GetIsLoggedIn();
    }
}
