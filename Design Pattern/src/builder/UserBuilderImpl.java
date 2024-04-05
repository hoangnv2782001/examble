package builder;

public class UserBuilderImpl implements UserBuilder{

    private int age;

    private String name;

    private String address;


    @Override
    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }

    @Override
    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    @Override
    public User build() {
        return new User(age,name,address);
    }
}
