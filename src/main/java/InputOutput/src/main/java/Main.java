import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        File directory = new File("folder");
        File file = new File(directory, "names.txt");

        try (OutputStream outputStream = new FileOutputStream(file)) {
            String names = "John Max Nick Thomas Andrew Roman Herbert";
            outputStream.write(names.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}