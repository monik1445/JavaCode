package Aug26Lambda;

import java.util.concurrent.Callable;

public class MainCalculate {
    public static void main(String[] args) {

        Calculator calculator = (num1, num2) -> {
            System.out.println(num1+" "+num2);
        };
        calculator.calculate(12,60);
    }
}






