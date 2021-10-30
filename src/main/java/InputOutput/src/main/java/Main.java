import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("1.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            int a = inputStream.read();
            while (a != -1) {
                System.out.print((char) a);
                a = inputStream.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}