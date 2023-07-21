package July4;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");

        int x = scanner.nextInt();

        if (x % 2 == 1) {
            System.out.println("The number is Odd");
        }else {
            System.out.println("The number is Even");
        }

        if (x % 4 == 0) {
            System.out.println("The number is leap year");
        }else {
            System.out.println("The number is not leap year");
        }

        if (x>0) {
            System.out.println("The number is positive");
        }else {
            System.out.println("The number is negative");
        }

    }
}
