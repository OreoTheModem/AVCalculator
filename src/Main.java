import java.util.Scanner;


public class Main{

    //Variables
    public static double num1, num2, num3;
    public static double sumOfAll, thirdOfAll;

    //Constructor



    //Scanner
    static Scanner scn = new Scanner(System.in);


    //Main Method
     public static void main(String[] args){

        //Name
        System.out.println("/                          \\");
        System.out.println("|Sum and Average Calculator|");
        System.out.println("\\                          /\n");

        //Explanation
         System.out.println("With this program you should be able to calculate not only the sum of, but also the average of three numbers\n");

        //Numbers
         //1st
        System.out.println("Please Enter Your First Number:");
        try{
            num1 = scn.nextDouble();
        }
        catch(Exception InputMismatchException) {
            System.out.println("You can only enter numbers");
        }

        //2nd
        System.out.println("Enter Your Second Number:");
         try{
             num2 = scn.nextDouble();
         }
         catch(Exception InputMismatchException) {
             System.out.println("You can only enter numbers");
         }

        //3rd
        System.out.println("Enter Your Third Number:");
         try{
             num3 = scn.nextDouble();
         }
         catch(Exception InputMismatchException) {
             System.out.println("You can only enter numbers");
         }


         //Answers
        System.out.println("The sum of the numbers:" + Calculations.sumOfAll());
        System.out.println("The average of the numbers:" + Calculations.thirdOfAll());
    }
}