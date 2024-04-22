package lamda;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * dùng để triển khai functional interface( một interface chỉ có duy nhất một method)
 */
public class Main {

    public static void main(String[] args) {

        //triển khai functional interface
//        Consumer<Integer> consumer = i -> System.out.println(i+1);
//
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        list.forEach(consumer);
//
//        //
//
//        Caculator caculator = (a,b)-> a+b;
//
//        System.out.println( caculator.sum(1,2));

        supliExamble();

        // method reference
        Consumer<Integer> consumer = System.out::println;

        consumer.accept(3);




        Predicate<Integer> predicate = integer -> integer>0;

        System.out.println(predicate.test(7));
    }


    public static void supliExamble(){
        Supplier<Integer> supplier = () -> 5;

        System.out.println(supplier.get());
    }
}
