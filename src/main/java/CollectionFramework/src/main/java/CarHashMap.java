import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

public class CarHashMap implements CarMap{

    private static final int INITIAL_CAPASITY = 16;

    private Entry[] array = new Entry[INITIAL_CAPASITY];
    private int size = 0;

    @Override
    public void put(CarOwner key, Car value) {
        int position = getElementPosition(key, array.length);
        Entry existedElement = array[position];
        if (existedElement == null) {
            Entry entry = new Entry(key, value, null);
            array[position] = entry;
            size++;
        } else {
            while (true) {
                if (existedElement.key.equals(key)) {
                    existedElement.value = value;
                    return;
                }
                if (existedElement.next == null) {
                    existedElement.next = new Entry(key, value, null);
                    size++;
                    return;
                }
                existedElement = existedElement.next;
            }
        }
    }

    @Override
    public Car get(CarOwner key) {
        int position = getElementPosition(key, array.length);
        Entry existedElement = array[position];
        while (existedElement != null) {
            if (existedElement.key.equals(key)) {
                return existedElement.value;
            }
            existedElement = existedElement.next;
        }
        return null;
    }

    @Override
    public Set<CarOwner> keySet() {
        return null;
    }

    @Override
    public List<Car> values() {
        return null;
    }

    @Override
    public boolean remove(CarOwner key) {
        int position = getElementPosition(key, array.length);
        Entry existedElement = array[position];
        if (existedElement != null && existedElement.key.equals(key)) {
            array[position] = existedElement.next;
            size --;
            return true;
        } else {
            while (existedElement != null) {
                Entry nextElement = existedElement.next;
                if (nextElement == null) {
                    return false;
                }
                if (nextElement.key.equals(key)) {
                    existedElement.next = nextElement.next;
                    size --;
                    return true;
                }
                existedElement = existedElement.next;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        array = new Entry[INITIAL_CAPASITY];
        size = 0;
    }

    private int getElementPosition(CarOwner carOwner, int arrayLength) {
        return Math.abs(carOwner.hashCode() % arrayLength);
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    private static class Entry {
        private CarOwner key;
        private Car value;
        private Entry next;
    }
}
