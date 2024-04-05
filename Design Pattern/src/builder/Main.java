package builder;

public class Main {

    public static void main(String[] args) {
        User u = new UserBuilderImpl().age(1).name("123").address("122334").build();

        System.out.println(u.getAddress());
    }
}
