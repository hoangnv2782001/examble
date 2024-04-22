package basic;

public  class Test2 implements Test1{


    public Test2(){

    }

    public Test2(String a){

    }

    public void ttt(){

    }


    public static void main(String[] args) {
        Test1 t = new Test2(){
            @Override
            public void ttt() {
                System.out.println(1111);
            }
        };

        t.ttt();
    }
//
//    @Override
//    public void dislay() {
//        System.out.println(123);
//    }
}
