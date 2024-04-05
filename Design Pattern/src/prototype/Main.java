package prototype;

public class Main {

    public static void main(String[] args) {
        Prototype p1 = new Prototype("prototype pattern");
        Prototype p2 = p1.clone();

        System.out.println("p1 : "+p1.getMessage() + " p2 : "+p2.getMessage());
    }
}
