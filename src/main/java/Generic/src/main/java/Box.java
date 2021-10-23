import java.util.List;

public class Box<T extends Number & Comparable<T>> {
    private T[] array;

    public double avg() {
        double result = 0;
        for (T elem : array) {
            result += ((Number) elem).doubleValue();
        }
        return result / array.length;
    }

    public int compare(Box<?> another) {
        if (avg() > another.avg()) {
            return 1;
        } else if (avg() == another.avg()) {
            return 0;
        } else {
            return -1;
        }
    }

    public static <U> U getfirstElem(List<U> list) {
        return list.get(0);
    }

    public static <U> void transfer(List<U> src, List<U> dst) {
        dst.addAll(src);
        src.clear();
    }

    public static void method(List<? extends Number> numbers) {

    }

    public Box(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }
}
