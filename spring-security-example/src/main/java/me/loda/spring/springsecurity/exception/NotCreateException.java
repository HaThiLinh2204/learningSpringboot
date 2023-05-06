package me.loda.spring.springsecurity.exception;

public class NotCreateException extends RuntimeException{
    public NotCreateException(String message){
        super(message);
    }
}
