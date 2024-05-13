package mediator;

public class MediatorImpl implements Mediator {

    private Device door;

    @Override
    public void open() {
        door.open();

    }

    @Override
    public void close() {
        door.close();
    }

    @Override
    public void addDevice(Device device) {
        door = device;

    }
}
