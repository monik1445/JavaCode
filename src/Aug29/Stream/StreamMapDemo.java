package Aug29.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapDemo {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> productOf3 = nums.stream().map(x->x*3).collect(Collectors.toList());
        System.out.println(productOf3);

        List<String> names = Arrays.asList("Mike", "John", "Peter", "Jane", "Dan", "Jennifer", "Peter", "Jane", "Dan", "Jennifer");
        List<String> collect = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);


    }
}
