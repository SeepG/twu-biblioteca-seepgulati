package com.twu.biblioteca;

public class UserProfile {
    private String Name;
    private String Email;
    private Integer PhoneNumber;

    public UserProfile(String Name, String Email, Integer PhoneNumber){
        this.Name = Name;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
    }

    private String getName() {
        return Name;
    }

    private String getEmail() {
        return Email;
    }

    public Integer getPhoneNumber() {
        return PhoneNumber;
    }

}
