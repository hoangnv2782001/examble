package builder;

public interface UserBuilder {

    UserBuilder name(String name);

    UserBuilder age(int age);

    UserBuilder address(String address);

    User build();
}
