import org.junit.Test;

import static org.junit.Assert.*;

public class BoxTest {

    @Test
    public void testBox() {
        Box<String, Integer> box1 = new Box<> ("string", 15);
        Box<String, Integer> box2 = new Box<> ("string", 15);
        int result = box1.getValue() + box2.getValue();
        assertEquals(30, result);
    }
}