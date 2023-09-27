package Aug29.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {


////                                   GCUKCGUK ``` `           for (Integer newlist:
////            list) {
        ////                System.out.println(newlist);
////            }
//
//        list.stream().filter(x -> x>10 && x<=20).forEach(System.out::println);

        List<String> names = Arrays.asList("Mike", "John", "Peter", "Jane", "Dan", "Jennifer", "Peter", "Jane", "Dan", "Jennifer");

//        names.stream().filter(x -> x.startsWith("J")).forEach(x-> System.out.println(x));
//        names.stream().filter(x-> x.length()>4).forEach(x-> System.out.println(x));

        Set<String> namesWithJ = names
                .stream()
                .filter(x -> x.startsWith("J"))
                .filter(y -> y.length() > 4)
                .distinct()
                .collect(Collectors.toSet());
        System.out.println(namesWithJ);

    }
}

