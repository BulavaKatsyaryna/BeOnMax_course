public class Main {
    public static void main(String[] args) {
//        new Thread(() -> System.out.println(1)).start();

        Director director = new Director();
        String result = director.force((n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println("Working...");
            }
            return "Success";
        }, 5);
        System.out.println(result);
    }
}