package July11;

import java.util.Scanner;

public class ControlStatementAssignment1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        String input;
        int x = scanner.nextInt();

        System.out.println("Enter 2nd Number");
        int y = scanner.nextInt();

        System.out.println("Enter 3rd Number");
        int z = scanner.nextInt();

        do {

            if (x > y && x > z) {
                System.out.println("First number is biggest");
            } else if (y > x && y > z) {
                System.out.println("Second number is biggest");
            } else if (z > x && z > y) {
                System.out.println("Third number is biggest");
            } else if (x == y && x == z) {
                System.out.println("All number are equal");
            } else {
                System.out.println("Invalid");
            }
            System.out.println("Do you want to exit? Press Y for yes and Press N for no");
            input = scanner.next();


        } while (input == "Y");
    }
}
