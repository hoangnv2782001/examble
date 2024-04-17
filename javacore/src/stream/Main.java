package stream;

import java.util.Arrays;
import java.util.List;
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

// Sắp xếp các loại hoa quả theo thứ tự alphabet
        List<String> sortedFruits = fruits.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedFruits); // Output: ["Apple", "Banana", "Grapes", "Orange"]


        //distict
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);

// Loại bỏ các số nguyên trùng lặp
        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());

        System.out.println(distinctNumbers); // Output: [1, 2, 3, 4]
// limit


// Lấy 3 số nguyên đầu tiên từ danh sách
        List<Integer> limitedNumbers = numbers.stream().limit(3).collect(Collectors.toList());

        System.out.println(limitedNumbers); // Output: [1, 2, 3]

//skip
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Yellow", "Purple");

// Bỏ qua 2 màu đầu tiên
        List<String> remainingColors = colors.stream().skip(2).collect(Collectors.toList());

        System.out.println(remainingColors); // Output: ["Blue", "Yellow", "Purple"]

    }
}
