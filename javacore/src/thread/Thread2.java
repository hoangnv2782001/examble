package thread;

/**
 * tạo thread bằng cách implement Runnable
 */
public class Thread2 implements Runnable{

    private int a;

    public Thread2(int a) {
        this.a = a;
    }

    @Override
    public void run() {
        while (a < 10)

        {
            try {
                Thread.sleep(100);

                System.out.println("thread2 " + a++);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
