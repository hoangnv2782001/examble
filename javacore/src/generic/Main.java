package generic;

import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Genneric<Integer> genneric = new Genneric<>();
//
//        genneric.append(10);
//        genneric.append(20);
//        genneric.append(30);
//
//        genneric.dislay();

        test();
    }


    public static void test(){
        int i = 5000;

        Integer y = 5000;

        if(i != y)
            System.out.println(123);

        if(i==y)
            System.out.println(456);
    }

    public static void test1(List<? extends Animal> l){

    }
}


class Dog extends Animal{

}

class Animal{

}
