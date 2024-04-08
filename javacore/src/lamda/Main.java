package lamda;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * dùng để triển khai functional interface( một interface chỉ có duy nhất một method)
 */
public class Main {

    public static void main(String[] args) {

        //triển khai functional interface
        Consumer<Integer> consumer = i -> System.out.println(i+1);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.forEach(consumer);

        //

        Caculator caculator = (a,b)-> a+b;

        System.out.println( caculator.sum(1,2));
    }
}
