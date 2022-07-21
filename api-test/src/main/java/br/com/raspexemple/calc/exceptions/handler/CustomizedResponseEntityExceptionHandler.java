package br.com.raspexemple.calc.exceptions.handler;

import br.com.raspexemple.calc.UnsupportedMathOperationException;
import br.com.raspexemple.calc.exceptions.ExceptionResponsive;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionResponsive> handleAllExceptions(Exception ex, WebRequest request){
        ExceptionResponsive exceptionResponsive = new ExceptionResponsive(
                new Date(),
                ex.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(exceptionResponsive, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(UnsupportedMathOperationException.class)
    public final ResponseEntity<ExceptionResponsive> handleBadRequestExceptions(Exception ex, WebRequest request) {
        ExceptionResponsive exceptionResponsive = new ExceptionResponsive(
                new Date(),
                ex.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(exceptionResponsive, HttpStatus.BAD_REQUEST);
    }
}
