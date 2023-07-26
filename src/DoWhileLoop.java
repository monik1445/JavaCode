import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your limit");
        int number = scanner.nextInt();


        int counter = 0;

        do {
            System.out.println(counter);
            counter++;
        } while (counter <= number);


    }
}
