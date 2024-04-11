package basic;

public class EnumExamble {

    public static void main(String[] args) {
        Size s = Size.HUGE;

        System.out.println(s.getSize());

        int [] a = {1,2,3};

        for(Size s1 : Size.values()){
            System.out.println(s1.getSize());
        }
    }
}
