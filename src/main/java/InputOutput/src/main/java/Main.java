import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("users.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        User user = new User("John", "Smith", 25);
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}