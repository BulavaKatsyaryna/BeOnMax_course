import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Float> numbers = new ArrayList<>();
        for (int i = 0; i < 30_000_000; i++) {
            numbers.add((float) i);
        }

        long before = System.currentTimeMillis();

        numbers.stream()
                .map((number) -> Math.sin(0.2f + number / 5) * Math.cos(0.2f + number / 5) * Math.cos(0.4f + number / 2))
                .collect(Collectors.toList());

        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
}