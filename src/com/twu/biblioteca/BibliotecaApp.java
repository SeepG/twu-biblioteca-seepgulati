package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {
    public String GetWelcomeMessage(){
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }

    public static void main(String[] args) {
        BibliotecaApp obj = new BibliotecaApp();
        System.out.println(obj.GetWelcomeMessage());
        //display a menu options - 1) List of books when selected leads to book list
        Menu menuOptions = new Menu();
        System.out.println(menuOptions.GetMenu());

        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        System.out.println(menuOptions.SelectOption(option));
    }

}
