package Exception;


import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/**
 * exception : lỗi xảy ra trong quá trình thực thi
 * 3 kiểu exception : checked , unchecked , error
 * try catch : handle exception xuất hiện trong code
 * finally : sử dụng để đóng các tài nguyên khởi tạo và luôn luôn được thực hiẹn
 */
public class Main {

    public static void main(String[] args) {

        // xử lí ngoại lệ vs try catch
        try {
            int a = 2 / 0;
        } catch (Exception e) {
            System.out.println("co loi xay ra");
        } finally {
            System.out.println("hoan tat");
        }

        // xử lí với ngoại lệ method ném ra exception
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
        new Main().test();


    }

    /**
     * throw : nem ra một exception cụ thể
     * throws : khai báo các exception có thể được ném ra bởi method
     *
     * @param dividend
     * @param divisor
     * @return
     * @throws ArithmeticException
     */
    public static int divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {

            throw new ArithmeticException("Cannot divide by zero");
        }
        return dividend / divisor;
    }

    public void test() {
        try {
            System.out.println(456);
        } catch (NumberFormatException | IllegalThreadStateException ex) {

        }

        try (Resource file = new Resource()) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    class Resource implements Closeable {

        @Override
        public void close() throws IOException {
            System.out.println(12345678);
        }
    }
}