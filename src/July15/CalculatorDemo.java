package July15;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {

        System.out.println("Welcome to my Calculator");
        System.out.println("Please choose one of the following");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");
        System.out.println("5. Modulus");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input");
        int input = scanner.nextInt();


            if (input == 1) {
                System.out.println("Enter first value:");
                int num1 = scanner.nextInt();
                System.out.println("Enter second value:");
                int num2 = scanner.nextInt();
                System.out.println("Enter third value:");
                int num11 = scanner.nextInt();
                System.out.println("Enter fourth value:");
                int num12 = scanner.nextInt();
                System.out.println("Result of 2 numbers: " + MethodsParameter.add(num1, num2));
                System.out.println("Result of 4 numbers: "+ MethodsParameter.add(num1,num2,num11,num12));
            } else if (input == 2) {
                System.out.println("Enter first value:");
                int num3 = scanner.nextInt();
                System.out.println("Enter second value:");
                int num4 = scanner.nextInt();
                System.out.println("Result: " + MethodsParameter.sub(num3, num4));
            } else if (input == 3) {
                System.out.println("Enter first value:");
                int num5 = scanner.nextInt();
                System.out.println("Enter second value:");
                int num6 = scanner.nextInt();
                System.out.println("Result: " + MethodsParameter.div(num5, num6));
            } else if (input == 4) {
                System.out.println("Enter first value:");
                int num7 = scanner.nextInt();
                System.out.println("Enter second value:");
                int num8 = scanner.nextInt();
                System.out.println("Result: " + MethodsParameter.mult(num7, num8));
            } else if (input == 5) {
                System.out.println("Enter first value:");
                int num9 = scanner.nextInt();
                System.out.println("Enter second value:");
                int num10 = scanner.nextInt();
                System.out.println("Result: " + MethodsParameter.mod(num9, num10));
            } else {
                System.out.println("Incorrect Input");
            }
    }
}
