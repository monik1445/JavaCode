package July11;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number");
        int number;


//        for (int i = 1; i <= 10; i++) {
//
//            number = scanner.nextInt();
//            if (number < 0) {
//                break;
//            }

            for (int i = 1; i <= 10; i++) {

                number = scanner.nextInt();
                if (number==13) {
                    continue;
                }
        }
    }
}
