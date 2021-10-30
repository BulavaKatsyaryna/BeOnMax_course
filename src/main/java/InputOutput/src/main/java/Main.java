import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File directory = new File("folder1");
        File file = new File("folder1/file1.txt");
        try {
            directory.mkdir();
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.getName());
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
    }
}
