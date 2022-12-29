package com.onetoMany.CustomException;

public class InvalidDetailsException extends RuntimeException{
    public InvalidDetailsException(String text){
        super(text);
    }
}
