package Aug26Lambda.Consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerFunctionalInterface {

    public static void main(String[] args) {

        Consumer<String> consumer = (st) -> {
            System.out.println(st.trim());
        };
        consumer.accept("  Pragra  ");

        BiConsumer<Integer, Integer> biConsumer = (num1, num2) -> System.out.println(num1+num2);
        biConsumer.accept(20,10);

        Predicate<Integer> predicate = (i)-> i%2==0;
        System.out.println(predicate.test(2));

    }
}
