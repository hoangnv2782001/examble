package factory;

public class AnimalFactory {

    private AnimalFactory(){

    }

    public static Animal getAnimal(String type){

        switch (type){
            case "DOG":
                return new Dog();

            case "CAT":
                return new Cat();

            default:
                return null;

        }
    }


}
