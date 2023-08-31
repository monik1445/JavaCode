package July25;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int number = scanner.nextInt();

        System.out.println(number);

        scanner.nextLine();
        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println(name);

    }
}
