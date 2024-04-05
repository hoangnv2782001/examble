package Exception;


/**
 * exception : lỗi xảy ra trong quá trình thực thi
 * 3 kiểu exception : checked , unchecked , error
 * try catch : handle exception xuất hiện trong code
 * finally : sử dụng để đóng các tài nguyên khởi tạo và luôn luôn được thực hiẹn
 */
public class Main {

    public static void main(String[] args) {
        try{
            int a = 2/0;
        }catch (Exception e){
            System.out.println("co loi xay ra");
        }finally {
            System.out.println("hoan tat");
        }
    }
}
