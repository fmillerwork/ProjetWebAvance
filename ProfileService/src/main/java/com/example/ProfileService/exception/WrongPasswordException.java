package com.example.ProfileService.exception;

public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException(long id){
        super("Wrong password for user : " + id);
    }
}
