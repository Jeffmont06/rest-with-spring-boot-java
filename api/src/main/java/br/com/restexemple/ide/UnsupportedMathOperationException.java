package br.com.restexemple.ide;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.BAD_GATEWAY)
public class UnsupportedMathOperationException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = -701663247896055482L;

    public UnsupportedMathOperationException(String ex) {
        super(ex);
    }
}
