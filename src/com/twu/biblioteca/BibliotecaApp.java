package com.twu.biblioteca;

import static java.lang.System.*;

public class BibliotecaApp {
    public static void main(String[] args) {
        BibliotecaApp obj = new BibliotecaApp();
        out.println(obj.GetWelcomeMessage());
    }
    public String GetWelcomeMessage(){
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }
}

