package br.com.raspexemple.calc.controller;

import br.com.raspexemple.calc.UnsupportedMathOperationException;
import br.com.raspexemple.calc.converters.NumberCorverter;
import br.com.raspexemple.calc.math.SimpleMath;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {
    private final AtomicLong counter = new AtomicLong();

    private SimpleMath math = new SimpleMath();
    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if (!NumberCorverter.isNumeric(numberOne) || !NumberCorverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.sum(NumberCorverter.convertToDouble(numberOne), NumberCorverter.convertToDouble(numberTwo));
    }
    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sub(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if (!NumberCorverter.isNumeric(numberOne) || !NumberCorverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.sub(NumberCorverter.convertToDouble(numberOne), NumberCorverter.convertToDouble(numberTwo));
    }
    @RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mult(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if (!NumberCorverter.isNumeric(numberOne) || !NumberCorverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.mult(NumberCorverter.convertToDouble(numberOne), NumberCorverter.convertToDouble(numberTwo));
    }
    @RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double div(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if (!NumberCorverter.isNumeric(numberOne) || !NumberCorverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.div(NumberCorverter.convertToDouble(numberOne), NumberCorverter.convertToDouble(numberTwo));
    }
    @RequestMapping(value = "/med/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double med(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if (!NumberCorverter.isNumeric(numberOne) || !NumberCorverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.med(NumberCorverter.convertToDouble(numberOne), NumberCorverter.convertToDouble(numberTwo));
    }
    @RequestMapping(value = "/raiz/{numberOne}", method = RequestMethod.GET)
    public Double raiz(
            @PathVariable(value = "numberOne") String numberOne
    ) throws Exception {
        if (!NumberCorverter.isNumeric(numberOne)){
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.raiz(NumberCorverter.convertToDouble(numberOne));
    }
}
