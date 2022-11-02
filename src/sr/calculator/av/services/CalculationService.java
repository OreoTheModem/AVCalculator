package sr.calculator.av.services;

import java.util.ArrayList;

public class CalculationService {

    public double sumOfAll(double num1, double num2, double num3){
        ArrayList<Double> myNumbers = new ArrayList<>();
        double total = 0;
        myNumbers.add(num1);
        myNumbers.add(num2);
        myNumbers.add(num3);

        for (Double myNumber : myNumbers) {
            total += myNumber;
        }
        return total;
    }

    public double thirdOfAll(double num1, double num2, double num3){
       return sumOfAll(num1, num2, num3)/3;
    }

}
