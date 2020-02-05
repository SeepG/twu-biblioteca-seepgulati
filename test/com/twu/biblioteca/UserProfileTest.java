package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserProfileTest {
    UserProfile profile = null;
    String Name = "Seep";
    String Email = "Seep@gmail.com";
    Integer PhoneNumber = 0401111111;
    String LibraryNumber = "123-4567";
    String Password = "PassyPass";
    @Before
    public void BeforeEach(){
        profile = new UserProfile(Name,Email,PhoneNumber,Password,LibraryNumber);
    }

    @Test
    public void loginSuccessfulTest() {
        Boolean expectedOutput = true;
        Boolean actualOutput = profile.Login(LibraryNumber,Password);
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void loginUnsuccessfulTest() {
        Boolean expectedOutput = false;
        Boolean actualOutput = profile.Login("Fake Number","Wrong Password");
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void getDetailsTest() {
        String expectedOutput= "Your details:-\n" +
                "Name:Seep\n" +
                "Email:Seep@gmail.com\n" +
                "PhoneNumber:67408457";
        String actualOutput = profile.GetDetails();
        assertEquals(expectedOutput,actualOutput);
    }
}