import org.junit.Test;

import static org.junit.Assert.*;

public class BoxTest {

    @Test
    public void testBox() {
        Box box1 = new Box(20);
        Box box2 = new Box(10);
        box2.setObject("qwerty");
        int n1 = 0;
        int n2 = 0;
        if (box1.getObject() instanceof Integer) {
            n1 = (int) box1.getObject();
        }
        if (box2.getObject() instanceof Integer) {
            n2 = (int) box2.getObject();
        }
        int expected = 20;
        int result = n1 + n2;
        assertEquals(expected, result);
    }
}