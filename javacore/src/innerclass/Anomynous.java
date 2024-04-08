package innerclass;

public class Anomynous {

    public static void main(String[] args) {
        //anomynous class
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("hoanf dep teai");
            }
        };

        r.run();
    }
}
