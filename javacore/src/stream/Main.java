package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // ví dụ về stream :
        int[] arr = {1, 2, 3, 4, 5, 6};

        Stream<Integer> stream = Arrays.stream(arr).mapToObj(Integer::valueOf);

        System.out.println(stream);


        // so luong element trong stream (“terminal operation”)
        long count = stream.count();

        System.out.println(count);

        // imtermedate operator

        // filter

        List<Integer> l = Arrays.stream(arr).mapToObj(Integer::valueOf).filter(e -> e > 2).toList();

        System.out.println(l);

        // map

        List<Integer> l1 = Arrays.stream(arr).mapToObj(Integer::valueOf).map(e -> e + 1).toList();

        System.out.println(l1);

        // foreach
        Arrays.stream(arr).mapToObj(Integer::valueOf).forEach(System.out::println);

        //soterd
        List<String> fruits = Arrays.asList("Orange", "Apple", "Banana", "Grapes");


        List<String> sortedFruits = fruits.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedFruits);


        //distict
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);


        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());

        System.out.println(distinctNumbers);
// limit



        List<Integer> limitedNumbers = numbers.stream().limit(3).collect(Collectors.toList());

        System.out.println(limitedNumbers);

//skip
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Yellow", "Purple");


        List<String> remainingColors = colors.stream().skip(2).collect(Collectors.toList());

        System.out.println(remainingColors);

        //reduce

        Optional<Integer> sum = numbers.stream()
                .reduce((a, b) -> a + b);

        System.out.println(sum.orElse(0));

        //optional: wrap lại giá trị thực cung cấp method sử lí vs null


        Optional<Integer> maxOptional = numbers.stream()
                .reduce(Integer::max);

        // Lấy giá trị lớn nhất và in ra
        Integer maxNumber = maxOptional.orElse(0);
        System.out.println( maxNumber);

        // searching

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");


        // tìm phần tử đầu tiên
        Optional<String> foundNameOptional = names.stream()
                .filter(name -> name.startsWith("C"))
                .findFirst();

        // check có phần tử nào thỏa mãn điều kiện
        boolean divisibleByThree = numbers.stream()
                .anyMatch(num -> num % 3 == 0);

        //
    }
}
