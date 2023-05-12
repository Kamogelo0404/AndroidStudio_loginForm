package com.example.springboot_login;

public class User {
    //declaration of variables
    private String userName;
    private String password;


    //create a constructor, which is a special method used for initializing the object of a class
    public User(String userName, String password) {

        //set userName to userName
        //This line assigns the value of the username parameter passed to the constructor to the username.
        this.userName = userName;
        this.password = password;
    }
}