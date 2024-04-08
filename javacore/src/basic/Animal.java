package basic;

/**
 * class biểu diễn animal
 *  * Class là bản thiết kế
 *  * Object là thể hiện cụ thể
 */
public class Animal {


    // biến static : biến của class chi sẻ chung với mọi object
    private static int a;

    // biến final là biến hằng số và không thể được thay đổi trong quá trình thực thi
    private final int b = 10;

    // khôi static gọi kh
    static {
        a = 10;
    }


    /**
     * staic method : sử dụng mà không cần tạo instance
     */
    public static void dislay(){
        System.out.println("hoang 123 "+a );
    }


    // method final khoong thể overrride
    public final void test(){

    }

    /**
     * constructor khởi tạo khi gọi object
     * this tham chiếu đến instance được khởi tạo
     * @param name
     * @param age
     */

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // properties
    private String name;

    private int age;


    //method


    public String getName() {

        return name +a;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Animal animal = new Animal("dog",2);


        System.out.println( animal.getName());

        Animal.dislay();

    }


}
