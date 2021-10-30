import java.io.*;

public class Main {
    public static void main(String[] args) {
        File directory = new File("folder");
        directory.mkdir();
        File file = new File(directory, "names.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (InputStream inputStream = new FileInputStream(file)) {
            int a = inputStream.read();
            while (a != -1) {
                System.out.print((char) a);
                a = inputStream.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}