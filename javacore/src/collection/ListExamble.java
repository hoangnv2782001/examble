package collection;

import java.util.ArrayList;
import java.util.List;

public class ListExamble {

    public static void main(String[] args) {



    }

    /**
     * // arraylist triển khai phổ biến nhất của List
     */
    public static void  arrayListExamble(){
        List<Integer> list = new ArrayList<>();

        // add element

        list.add(1);
        list.add(2);
        list.add(3);

        //remove e

        list.remove(1);

        list.forEach(System.out::println);

        // nhieu method khac
    }


}
