package sr.calculator.av.app;

import sr.calculator.av.services.CalculationService;

import java.util.Scanner;


public class Application {

    //Main Method
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double num1, num2, num3;

        System.out.println("/                          \\");
        System.out.println("|Sum and Average Calculator|");
        System.out.println("\\                          /\n");
        System.out.println("With this program you should be able to calculate not only the sum of, but also the average of three numbers\n");

        try {
            System.out.println("Please Enter Your First Number:");
            num1 = scn.nextDouble();

            System.out.println("Enter Your Second Number:");
            num2 = scn.nextDouble();

            System.out.println("Enter Your Third Number:");
            num3 = scn.nextDouble();

            CalculationService cs = new CalculationService();
            System.out.println("The sum of the numbers:" + cs.sumOfAll(num1, num2, num3));
            System.out.println("The average of the numbers:" + cs.thirdOfAll(num1, num2, num3));
        } catch (Exception InputMismatchException) {
            System.out.println("You can only enter numbers");
        }
    }
}
