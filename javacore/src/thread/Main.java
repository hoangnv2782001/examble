package thread;

/**
 * thread là một sub-process đơn vị nhỏ nhất được quản lí bởi jvm thực hiện một công việc nào đó
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

//        Thread1 t1 = new Thread1(1);
//        Thread2 t2 = new Thread2(1);
//
//        Thread t = new Thread(t2);
//
//        t1.start();
//        t.start();

        joidMethod();

    }


    /**
     * ví dụ về join
     */
    public static void joidMethod() throws InterruptedException {

        // ví dụ về join: thread join đc thực thi cho đến khi complete
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<10;i++)
                    System.out.println("thread 1 "+ i);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<10;i++)
                    System.out.println("thread 2"+ i);
            }
        });

        thread1.start();

        thread2.start();

        thread2.join();


//        thread2.wait();

//        Thread.currentThread()

    }

    public static void yieldExamble(){

    }
}
