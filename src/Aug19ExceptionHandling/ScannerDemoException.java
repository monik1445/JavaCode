package Aug19ExceptionHandling;

import java.util.Scanner;

public class ScannerDemoException {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter First number");
        double num1 = scanner.nextInt();

        System.out.println("Please enter Second number");
        double num2 = scanner.nextInt();

        try {
            System.out.println("Factorial: " + num1/num2);
        }
        catch (Exception e){
            e.printStackTrace();
        }



    }


}
