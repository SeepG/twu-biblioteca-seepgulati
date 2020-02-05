package com.twu.biblioteca;

public class Menu {
    public static final String InvalidOptionMessage = "Please select a valid option! or select 0 to exit";
    public static final String ReturnOutputMessage  = "Please enter a book name to return";
    public static final String QuitAppMessage = "Thank you for visiting Biblioteca";
    public static final String CheckoutOutputMessage = "Please enter a book name to checkout";
    public static final String CheckoutMovieOutputMessage = "Please enter a movie name to checkout";
    public String GetMenu(){
        return "Please select an option to continue\n"+
                "1. List of books \n"+
                "2. List of movies \n"+
                "3. Return a book \n"+
                "0. To exit";
    }
//Code is wrapped in try & catch to handle non integer user inputs
    public Integer ValidateOption(String option){
        try {
            return Integer.parseInt(option.trim());
        }
        catch (NumberFormatException ex){
            return -1;
        }
    }
//User Input cases for menu selection
    public String SelectOption(String option) {
        int intOption = ValidateOption(option);
        String optionOutput = "";
            switch (intOption) {
                case 0:
                    return QuitAppMessage;
                case 1:
                    optionOutput = CheckoutOutputMessage;
                    break;
                case 2:
                    optionOutput = CheckoutMovieOutputMessage;
                    break;
                case 3:
                     optionOutput = ReturnOutputMessage;
                     break;
                default:
                    return InvalidOptionMessage;
            }

            return optionOutput;

    }
}