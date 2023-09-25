package org.example.process;

import static java.lang.Math.sin;

public class ScientificCalculator implements Calculator{
    @Override
    public double calculate(double num1, double num2){
        return sin(num1) + sin(num2);
    }
}
