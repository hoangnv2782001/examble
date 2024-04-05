package oop;

/**
 * tính đa hình : một method có nhiều phương thức triển khai
 */
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();

        Animal cat = new Cat();


       dog.run();


       cat.run();

       Cat c2 = new Cat();


       c2.eat("ertyuio");
       c2.eat();

    }
}
