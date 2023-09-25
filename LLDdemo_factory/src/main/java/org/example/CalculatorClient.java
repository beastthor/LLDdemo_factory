package org.example;

import org.example.process.Calculator;
import org.example.process.CalculatorFactory;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CalculatorClient {
    public static void main(String[] args) {

        CalculatorFactory calculatorFactory = new CalculatorFactory();

        Calculator basicCalculator = calculatorFactory.createCalculator("basic");
        double result1 = basicCalculator.calculate(10, 20);
        System.out.println("Basic Calculator Result: " + result1);

        Calculator scientificCalculator = calculatorFactory.createCalculator("scientific");
        double result2 = scientificCalculator.calculate(10, 20);
        System.out.println("Scientific Calculator Result: " + result2);


        }
    }
