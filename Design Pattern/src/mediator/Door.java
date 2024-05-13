package mediator;

public class Door extends Device{

    private boolean isClose;
    public Door(Mediator mediator) {
        super(mediator);
        isClose = true;
    }

    @Override
    public void open() {
       if(isClose){
           System.out.println("door open");
           isClose = false;
       }

    }

    @Override
    public void close() {
        if (!isClose){
            System.out.println("door close");
            isClose = true;
        }

    }
}
