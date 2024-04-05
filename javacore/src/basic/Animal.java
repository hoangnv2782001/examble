package basic;

/**
 * class biểu diễn animal
 *  * Class là bản thiết kế
 *  * Object là thể hiện cụ thể
 */
public class Animal {

    /**
     * constructor khởi tạo khi gọi object
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
        return name;
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
    }


}
