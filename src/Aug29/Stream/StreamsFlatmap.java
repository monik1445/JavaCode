package Aug29.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatmap {
    public static void main(String[] args) {

        List<String> names1 = Arrays.asList("Monik", "Krishna");
        List<String> names2 = Arrays.asList("Heena", "Rasik");
        List<String> names3 = Arrays.asList("Jay", "Shashikala");

        List<List<String>> allNames = Arrays.asList(names1, names2, names3);

        System.out.println(allNames);

        List<String> finalcollect = allNames.stream().flatMap(x -> x.stream()).collect(Collectors.toList());

        System.out.println(finalcollect);

        List<String> Refined = finalcollect.stream().map(y -> y.toUpperCase()).collect(Collectors.toList());
        System.out.println(Refined);


    }
}
