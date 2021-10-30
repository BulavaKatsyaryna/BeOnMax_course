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
            long before = System.currentTimeMillis();
            int a = inputStream.read();
            StringBuilder result = new StringBuilder();
            while (a != -1) {
                result.append((char) a);
                a = inputStream.read();
            }
            System.out.println(result.toString());
            long after = System.currentTimeMillis();
            System.out.println(after - before);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}