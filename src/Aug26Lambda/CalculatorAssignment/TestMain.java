package Aug26Lambda.CalculatorAssignment;

import java.util.concurrent.Callable;

public class TestMain {

    public static void main(String[] args) {

       Calculator add = (int num1, int num2) -> {
           System.out.println(num1+num2);
       };

        Calculator sub = (int num1, int num2) -> {
            System.out.println(num1-num2);
        };

        Calculator mul = (int num1, int num2) -> {
            System.out.println(num1*num2);
        };

        Calculator div = (int num1, int num2) -> {
            System.out.println(num1/num2);
        };

        add.input(4,2);
        sub.input(4,2);
        mul.input(4,2);
        div.input(4,2);
    }
}
