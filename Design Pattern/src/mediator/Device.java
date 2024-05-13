package mediator;

public abstract class Device {

    protected Mediator mediator;


    public Device(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void open();

    public abstract void close();
}
