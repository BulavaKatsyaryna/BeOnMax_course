import java.io.Serializable;

public class User extends Person implements Serializable {
    private int age;

    public User(String name, String lastName, int age, Address address) {
        super(name, lastName);
        this.age = age;
        this.address = address;
    }

    private Address address;

    public User(String name, String lastName) {
        super(name, lastName);
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", address=" + address +
                '}';
    }
}
