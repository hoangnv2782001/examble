package innerclass;

public class Main {

    private int a;

    private static int c ;

    static {
        c = 10;
    }

    public Main(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Main m = new Main(1);

        Test t = m.new Test(1,"22");

        t.dislay();

        Test1 t1 = new Main.Test1(1);

        t1.dislay();
    }

    /**
     * inner class : class nam trong class khac
     */
    public class Test{
        private int a;
        private String b;

        public Test(int a, String b) {


            this.a = a;
            this.b = b;
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public String getB() {
            return b;
        }

        public void setB(String b) {
            this.b = b;
        }

        public void dislay(){
            System.out.println(Main.this.a);
        }
    }

    /**
     * innner static class : không cần tạo instacne class wrapper  để khởi tạo
     */
    public static class Test1{
        private int c;

        public Test1(int c) {
            this.c = c;
        }

        public void dislay(){
            System.out.println(Main.c);
        }

        public int getC() {
            return c;
        }

        public void setC(int c) {
            this.c = c;
        }
    }
}
