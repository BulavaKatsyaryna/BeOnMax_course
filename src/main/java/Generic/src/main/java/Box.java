public class Box<T extends Number & Comparable> {
    private T[] array;

    public double avg() {
        double result = 0;
        for (T elem : array) {
            result += ((Number) elem).doubleValue();
        }
        return result / array.length;
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
