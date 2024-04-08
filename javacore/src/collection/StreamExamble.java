package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * cung cấp các api thao tác trên các collection
 */
public class StreamExamble {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);

        int sum = list.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);


        List<Integer> l1 = list.stream().map(a->a*2).toList();

        l1.forEach(System.out::println);
    }
}
