public class Main {
    public static void main(String[] args) {
//        new Thread(() -> System.out.println(1)).start();

        Director director = new Director();
        director.force(new Worker() {

            @Override
            public void work() {
                System.out.println("Working..");
            }
        });
    }
}