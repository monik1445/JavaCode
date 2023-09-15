package Aug22CollectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList();
        list.add(1);
        System.out.println(list);

        List<Integer> list2 = new ArrayList();
        list2.add(2);

        list.addAll(list2);

        System.out.println(list);

        List<Integer>  obj1 = new LinkedList<>();



    }
}
