package basic;

public abstract interface Test1 {

//    public abstract void dislay();

    public void ttt();

    default void dislay(){
        System.out.println("12345678");
    }
}
