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

        System.out.println(obj.GetWelcomeMessage());
        //display menu options - 1) List of books when selected leads to book list
        System.out.println(menuOptions.GetMenu()); //accessing getMenu return
        String optionOutput = ""; //initialising optionOutput to empty string so that it is not null
        Scanner input = new Scanner(System.in);//getting user input through Scanner

        while(optionOutput == "" || optionOutput == Menu.InvalidOptionMessage){
            String userOption = input.nextLine();//that captures string
            optionOutput = menuOptions.SelectOption(userOption);//accessing SelectOption and matching with User Input ?
            System.out.println(optionOutput);
        }

        String bookName = input.nextLine();
        while(!bookName.equals(CheckoutBook.QuitPhrase)){
            Book checkedoutBook = checkoutBook.Checkout(bookName);
            if(checkedoutBook != null){
                System.out.println(CheckoutBook.ThankYouMessage);
                String availableBooks = checkoutBook.GetAvailableBooks();
                System.out.println(CheckoutBook.AvailableBooksMessage);
                System.out.println(availableBooks);//list of available books
                bookName = input.nextLine();
            }
            else{
                System.out.println(CheckoutBook.ErrorMessage);
                bookName = input.nextLine();
            }
        }


    }

}
