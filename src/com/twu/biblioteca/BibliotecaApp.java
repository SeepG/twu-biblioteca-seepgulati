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
        while(!bookName.equals("quit")){
            Book checkedoutBook = checkoutBook.Checkout(bookName);
            if(checkedoutBook != null){
                System.out.println("Thank you! Enjoy the book");
                String availableBooks = checkoutBook.GetAvailableBooks();
                System.out.println("Available Books");
                System.out.println(availableBooks);
            }
            else{
                System.out.println("Sorry that book is not available, please choose a book from the list or enter quit to exit");
                bookName = input.next();
            }
        }


    }

}
