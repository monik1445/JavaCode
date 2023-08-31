package July22;

import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {

        String names[] = new String[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Names");

        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.next();
        }

//        for (int i = 0; i < names.length; i++) {
//            names[i]=scanner.next();
//        }
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }

        for (String s:
             names) {
            System.out.println(s);
        }

    }

}
