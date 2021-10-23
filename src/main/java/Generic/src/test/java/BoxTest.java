import org.junit.Test;

import static org.junit.Assert.*;

public class BoxTest {

    @Test
    public void testBox() {
        Box<Integer> box = new Box<>(5, 10, 15);
        assertEquals(10, box.avg(), 0.001);
    }
}