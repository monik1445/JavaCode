package July4;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day number of the week:");
        int a = scanner.nextInt();

            if (a == 1) {
                System.out.println("Its Monday!");
            } else if (a == 2) {
                System.out.println("Its Tuesday!");
            } else if (a == 3) {
                System.out.println("Its Wednesday!");
            } else if (a == 4) {
                System.out.println("Its Thursday!");
            } else if (a == 5) {
                System.out.println("Its Friday!");
            } else if (a == 6) {
                System.out.println("Its Saturday!");
            } else if (a == 7) {
                System.out.println("Its Sunday!");
            } else {
                System.out.println("Invalid Input");
            }

    }
}
