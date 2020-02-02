package com.twu.biblioteca;

public class Menu {
    public static final String InvalidOptionMessage = "Please select a valid option! or select 0 to exit";
    public String GetMenu(){
        return "Please select an option to continue\n 1. List of books";
    }

    public Integer ValidateOption(String option){
        try {
            return Integer.parseInt(option.trim());
        }
        catch (NumberFormatException ex){
            return -1;
        }
    }

    public String SelectOption(String option) {
        int intOption = ValidateOption(option);
        String optionOutput = "";
            switch (intOption) {
                case 0:
                    return "Thank you for visiting Biblioteca";
                case 1:
                    BookList bookList = new BookList();
                    // prints book list
                    for (Book book : bookList.getBooks()) {
                        optionOutput += " - " + book.getName() + " | " + book.getAuthor() + " | " + book.getPublicationYear() + "\n";
                    }
                    return optionOutput;
                default:
                    return InvalidOptionMessage;
            }

    }
}