import java.io.*;

public class Main {
    public static void main(String[] args) {
        var file = new File("users.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        var user = new User("John", "Smith", 25, new Address("Main", 10));
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            var savedUser = objectInputStream.readObject();
            System.out.println(savedUser);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}