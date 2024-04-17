package collection;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExamble {

    String a;
    public static void main(String[] args) {

        // set la cau truc du lieu chi cho phep luu tru cac phan tu khong trung lap
        Set<Integer> s = new HashSet<>();

        s.add(1);
        s.add(2);
        s.add(1);

        s.forEach(System.out::println);

        Set s1 = new TreeSet();

        s1.add("1");
        s1.add(3);
        s1.add("2");

        Iterator i = s1.iterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }

    }

    @Override
    public boolean equals(Object obj) {
        return ((SetExamble)obj).a.equals("hhhh");
    }
}
