package basic;

import java.io.IOException;

public class Test {

    private int a;


    public Test() {
        this.a = 5;
        System.out.println("tét1"+a);
    }

    public Test dislay() throws IOException {
        System.out.println(1111111);

        return new Test();
    }
}

class Test11 extends Test {

    public Test11() {
        super();


        System.out.println("tét11");
    }

    public Test11(String a){
        this();
    }

    @Override
    public Test11 dislay()  {
        System.out.println(34567890);
        return new Test11();
    }

    public static void main(String[] args) {
        Test11 t = new Test11();

        Test t1 = new Test11();

        t.dislay();

    }
}


