package thread;


/**
 * Tạo thread bằng cách kế thừa class thread
 */
public class Thread1 extends Thread{

    private int a;

    public Thread1(int a) {
        this.a = a;
    }

    @Override
    public void run() {

        while (a < 10)

        {
            try {
                Thread.sleep(100);

                System.out.println("thread1 " + a++);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
