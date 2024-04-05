package oop;


/**
 * Tính đóng gói : đóng gói dữ liệu và meothod trên dưới một đơn vị gọi là class
 * data hiding : ẩn dữ liệu người dùng chỉ được truy cập dữ liệu dựa trên access modifier
 */
public class Human {

    private String name;

    private int age;

    private String job;


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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Human(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }
}
