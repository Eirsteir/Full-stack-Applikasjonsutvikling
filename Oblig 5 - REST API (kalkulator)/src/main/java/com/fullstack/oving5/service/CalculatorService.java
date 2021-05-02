package com.fullstack.oving5.service;

import com.fullstack.oving5.dto.Computation;
import org.springframework.stereotype.Service;

@Service
public interface CalculatorService {

    Double calculate(Computation computation);

}

