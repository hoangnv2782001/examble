package mediator;

public class Remote extends Device{
    public Remote(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void open() {
        mediator.open();
    }

    @Override
    public void close() {
        mediator.close();
    }
}
