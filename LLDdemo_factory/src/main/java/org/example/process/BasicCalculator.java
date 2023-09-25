package org.example.process;

public class BasicCalculator implements Calculator{
    @Override
    public double calculate(double num1, double num2){
        return num1 + num2;
    }
}
