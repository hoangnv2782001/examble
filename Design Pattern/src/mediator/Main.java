package mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();

        Device remote = new Remote(mediator);

        Device door = new Door(mediator);

        mediator.addDevice(door);

        remote.open();

        remote.close();

    }
}
