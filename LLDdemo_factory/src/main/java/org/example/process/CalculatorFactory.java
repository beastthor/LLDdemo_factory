package org.example.process;

public class CalculatorFactory {
    public Calculator createCalculator(String type){
        if("basic".equalsIgnoreCase(type)){
            return new BasicCalculator();
        }
        else if("scientific".equalsIgnoreCase(type)){
            return new ScientificCalculator();
        }else {
            throw new IllegalArgumentException("Invalid calculator type: " + type );
        }
    }
}
