import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarMapTest {
    private CarMap map;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void whenPut100ElementsThenSizeBecome100() {
        for (int i = 0; i < 100; i++) {
            CarOwner carOwner = new CarOwner(i, "Name" + 1, "LastName" + 1);
            Car car = new Car("Brand" + 1, i);
            map.put(carOwner, car);
        }
        assertEquals(100, map.size());
    }

    @Test
    public void whenPut100ElementsWith100DifferentKeysThenSize10() {
        for (int i = 0; i < 100; i++) {
            int index = i % 10;
            CarOwner carOwner = new CarOwner(index, "Name" + index, "LastName" + index);
            Car car = new Car("Brand" + index, index);
            map.put(carOwner, car);
        }
        assertEquals(10, map.size());
    }
}