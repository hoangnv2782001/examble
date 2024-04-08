package oop;

/**
 * tính kế thừa : các class con có thể kế thừa thuộc tính và method của class cha phụ thuộc vào
 * acccess modifier
 */
public class Teacher extends Human{

    /**
     * super từ khóa tham chiếu đến class cha có thể dùng để :
     *  + call constructor
     *  + call method cua
     * @param name
     * @param age
     * @param job
     */
    public Teacher(String name, int age, String job) {
        super(name, age, job);
    }

    public static void main(String[] args) {
        Teacher tecTeacher = new Teacher("hoang",2,"student");

        tecTeacher.getName();
    }
}
