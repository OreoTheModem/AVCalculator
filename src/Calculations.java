import java.util.ArrayList;

public class Calculations {

    static double sumOfAll(){
        ArrayList<Double> myNumbers = new ArrayList<>();
        myNumbers.add(Main.num1);
        myNumbers.add(Main.num2);
        myNumbers.add(Main.num3);

        for (Double myNumber : myNumbers) {
            Main.sumOfAll += myNumber;
        }
        return Main.sumOfAll;
    }

    static double thirdOfAll(){
        Main.thirdOfAll = Main.sumOfAll/3;
        return Main.thirdOfAll;
    }

}
