import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Alex", 35));
        users.add(new User("Max", 22));
        users.add(new User("John", 17));
        users.add(new User("Andrew", 33));
        users.add(new User("Jack", 44));
        users.add(new User("Nick", 80));
        users.add(new User("Alice", 46));
        users.add(new User("Helen", 11));

        Optional<User> oldest = users.stream()
                .filter(user -> user.getAge() < 80)
                .max(Comparator.comparingInt(User::getAge));

        oldest.ifPresentOrElse(System.out::println, () -> System.out.println("User not found!"));
    }
}