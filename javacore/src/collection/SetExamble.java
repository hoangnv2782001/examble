package collection;


import java.util.HashSet;
import java.util.Set;

public class SetExamble {

    public static void main(String[] args) {

        // set la cau truc du lieu chi cho phep luu tru cac phan tu khong trung lap
        Set<Integer> s = new HashSet<>();

        s.add(1);
        s.add(2);
        s.add(1);

        s.forEach(System.out::println);

    }
}
