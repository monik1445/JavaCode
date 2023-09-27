package LambdaAssignmentW3Resource;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        // #1
        BiConsumer<Integer,Integer> biConsumer = (num1, num2) ->{
            System.out.println(num1+num2);
        };
        biConsumer.accept(5,2);

        System.out.println("********************");

        // #2
        Predicate<String> predicate = (i)->
            i.isEmpty();

        String i1 = "";
        String i2 = "Monik";

        System.out.println(i1.isEmpty());
        System.out.println(i2.isEmpty());

        System.out.println("********************");

        // #3

        Consumer<String> consumer = (i)->i.toUpperCase();
        Consumer<String> consumer1 = (i)->i.toLowerCase();

        String i3 = "MoNik";

        System.out.println(i3.toUpperCase());
        System.out.println(i3.toLowerCase());

        System.out.println("********************");

        // #4

    }
}
