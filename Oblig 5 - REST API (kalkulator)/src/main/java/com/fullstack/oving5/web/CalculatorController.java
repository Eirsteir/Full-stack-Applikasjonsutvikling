package com.fullstack.oving5.web;


import com.fullstack.oving5.dto.Computation;
import com.fullstack.oving5.service.CalculatorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/compute/")
public class CalculatorController {


    private CalculatorService calculatorService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Double compute(@RequestBody Computation computation) {
        return calculatorService.calculate(computation);
    }
}
