package oop;

/**
 * overriding : ghi đè lại phương thức lớp cha
 * overloading : 2 method cung tên nhưng khác tham số truyền vào
 */
public class Cat implements Animal{
    @Override
    public void run() {
        System.out.println("meomeomeo");
    }


    public void eat(String food){
        System.out.println(food);
    }

    public void eat(){
        System.out.println("eat food");
    }
}
