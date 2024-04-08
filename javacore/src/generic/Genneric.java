package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * cơ chế tham số hóa kiểu dữ liệu giúp linh hoạt trong việc làm việc với các ctdl yêu cầu sự
 * linh hoạt trong kiểu dữ liệu
 * Thường được sử dụng trong collection
 * @param <T>
 */
public class Genneric <E>{

    private List<E> array;

    public Genneric() {
        this.array = new ArrayList<>();
    }


    public void append(E e){
        array.add(e);
    }

    public void dislay(){
        for(E e : array){
            System.out.println(e);
        }
    }
}
