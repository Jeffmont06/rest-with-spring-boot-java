package br.com.restexemple.ide.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class ExceptionResponsive implements Serializable {

    @Serial
    private static final long serialVersionUID = -3486196671882291923L;

    private Date timestamp;
    private String message;
    private String details;


}


