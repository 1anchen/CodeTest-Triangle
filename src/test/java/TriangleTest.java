import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class TriangleTest {

    Triangle impossible;

    @Before
    public void before() {
        impossible = new Triangle(2, 2, 5);
    }

    @Test
    public void canGetSideA() {
        assertEquals(2, impossible.getSideA());
    }

    @Test
    public void canGetSideB() {
        assertEquals(2, impossible.getSideB());
    }

    @Test
    public void canGetSideC() {
        assertEquals(5, impossible.getSideC());
    }
}