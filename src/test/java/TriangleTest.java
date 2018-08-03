import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class TriangleTest {

    Triangle newTriangle;

    @Before
    public void before() {
        newTriangle = new Triangle();
    }

    @Test
    public void canDetermineShapeImpossibleABSmallerThanC() {
        assertEquals("Impossible", newTriangle.determineShape(2,2,5));
    }
    @Test
    public void canDetermineShapeImpossibleACSmallerThanB() {
        assertEquals("Impossible", newTriangle.determineShape(1,2,1));
    }
    @Test
    public void canDetermineShapeImpossibleBCSmallerThanA() {
        assertEquals("Impossible", newTriangle.determineShape(15,2,1));
    }

    @Test
    public void canDetermineShapeIsoscelesAEqualBNotC() {
        assertEquals("Isosceles", newTriangle.determineShape(4,4,5));
    }

    @Test
    public void canDetermineShapeIsoscelesAEqualCNotB() {
        assertEquals("Isosceles", newTriangle.determineShape(2,3,2));
    }

    @Test
    public void canDetermineShapeIsoscelesCEqualBNotA() {
        assertEquals("Isosceles", newTriangle.determineShape(7,10,10));
    }

    @Test
    public void canDetermineShapeIrregularASmallerThanBSmallerThanC() {
        assertEquals("Irregular", newTriangle.determineShape(2,4,5));
    }

    @Test
    public void canDetermineShapeIrregularABiggerThanBBiggerThanC() {
        assertEquals("Irregular", newTriangle.determineShape(10,8,7));
    }

    @Test
    public void canDetermineShapeIrregularBBiggerThanAABiggerThanC() {
        assertEquals("Irregular", newTriangle.determineShape(7,12,6));
    }

    @Test
    public void canDetermineShapeIrregularCBiggerThanAABiggerThanB() {
        assertEquals("Irregular", newTriangle.determineShape(7,5,9));
    }

    @Test
    public void canDetermineShapeEquilateral() {
        assertEquals("Equilateral", newTriangle.determineShape(4,4,4));
    }
}