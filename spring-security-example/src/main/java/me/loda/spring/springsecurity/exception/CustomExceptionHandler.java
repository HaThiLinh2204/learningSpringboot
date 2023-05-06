package me.loda.spring.springsecurity.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handlerNotFoundException(NotFoundException ex, WebRequest req){
        return new ErrorResponse(HttpStatus.NOT_FOUND,ex.getMessage());
    }
    @ExceptionHandler(NotCreateException.class)
    @ResponseStatus(HttpStatus.CREATED)
    public ErrorResponse handlerNotCreateException(NotCreateException ex, WebRequest req){
        return new ErrorResponse(HttpStatus.CREATED, ex.getMessage());
    }
}
