package com.switchfully.springbootfuniversity.view.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    protected void nullPointerException(NullPointerException exception, HttpServletResponse response) throws Exception{
        response.sendError(HttpStatus.BAD_REQUEST.value(), "Parameter can not be null");
    }

    @ExceptionHandler(ProfessorNotFoundException.class)
    protected void professorNotFoundException(ProfessorNotFoundException exception, HttpServletResponse response) throws Exception{
        response.sendError(HttpStatus.NOT_FOUND.value(), exception.getMessage());
    }
}
