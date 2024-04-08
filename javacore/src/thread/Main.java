package thread;

/**
 * thread là một sub-process đơn vị nhỏ nhất được quản lí bởi jvm thực hiện một công việc nào đó
 */
public class Main {

    public static void main(String[] args) {

        Thread1 t1 = new Thread1(1);
        Thread2 t2 = new Thread2(1);

        Thread t = new Thread(t2);

        t1.start();
        t.start();

    }
}
