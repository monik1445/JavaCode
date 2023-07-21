package July4;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = scanner.nextInt();

        System.out.println("Enter the second number");
        int b = scanner.nextInt();

        System.out.println("Enter the third number");
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("First number is biggest");
        } else if (b > c && b > a) {
            System.out.println("Second number is biggest");
        }
        else if (c > a && c > b) {
            System.out.println("Third number is biggest");
        }
    }
}