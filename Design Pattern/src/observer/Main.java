package observer;

public class Main {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();


        Observer user1 = new User("User1");
        Observer user2 = new User("User2");


        eventManager.registerObserver(user1);
        eventManager.registerObserver(user2);


        eventManager.publishEvent("New event occurred!");
    }
}
