package com.twu.biblioteca;

public class UserProfile {
    public static final String LoginError = "Sorry, the library number and password is invalid";
    private String Name;
    private Boolean IsLoggedIn = false;
    private String Email;
    private Integer PhoneNumber;
    private String  Password;
    private String  LibraryNumber;

    public UserProfile(String Name, String Email, Integer PhoneNumber, String Password, String LibraryNumber){
        this.Name = Name;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
        this.Password = Password;
        this.LibraryNumber = LibraryNumber;
    }
    public Boolean GetIsLoggedIn(){
        return IsLoggedIn;
    }

    public Boolean Login(String username, String password){
        IsLoggedIn =  username.equals(this.LibraryNumber) && password.equals(this.Password);
        return IsLoggedIn;
    }

    public String GetDetails(){
        return "Your details:-\n"+
                "Name:"+this.Name+"\n"+
                "Email:"+this.Email+"\n"+
                "PhoneNumber:"+this.PhoneNumber;
    }

}
