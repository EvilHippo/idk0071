package com.spring.Exeptions;

public class UserExists extends Exception {
    public UserExists(String message) {
        super(message);
    }
}
