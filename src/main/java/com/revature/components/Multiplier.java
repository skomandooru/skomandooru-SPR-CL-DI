package com.revature.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Multiplier {
    private Adder adder;

    @Autowired
    public Multiplier(Adder adder) {
        this.adder = adder;
    }

    public double multiply(double a, double b) {
        double result = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            result = adder.add(result, a);
        }
        // Handle the edge case of negative b
        if (b < 0) result *= -1;
        return result;
    }
}
