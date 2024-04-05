package factory;

public class Main {
    public static void main(String[] args) {
       Animal dog = AnimalFactory.getAnimal("DOG");
        Animal cat = AnimalFactory.getAnimal("CAT");

        System.out.println(dog.getAnimalName()+" "+cat.getAnimalName());
    }
}
