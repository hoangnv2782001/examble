package collection;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapExamble {

    public static void main(String[] args) {

        // map la cấu trúc dữ liệu dùng để lưu trữ cập key value
        // triển khai khác như LinkedHashMap, TreeMap
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"hoang123");

        map.put(2,"âkakak");

        map.forEach((key,value)->{
            System.out.println(key + " "+value);
        });
    }
}
