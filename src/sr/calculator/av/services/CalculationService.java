package sr.calculator.av.services;

import java.util.ArrayList;

public class CalculationService {

    public double sum(double num1, double num2, double num3){
        return num1 + num2 + num3;
    }

    public double average(double num1, double num2, double num3){
       return (num1 + num2 + num3)/3;
    }

}
