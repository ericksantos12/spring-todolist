package com.ericksantos.todolist.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {

    // Handle HttpMessageNotReadableException by returning a ResponseEntity with a
    // status of BAD_REQUEST
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<String> httpMessageNotReadable(HttpMessageNotReadableException e) {
        // Extract the most specific cause message from the exception
        String errorMessage = e.getMostSpecificCause().getMessage();

        // Return a ResponseEntity with the extracted error message and a status of
        // BAD_REQUEST
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
    }
}
