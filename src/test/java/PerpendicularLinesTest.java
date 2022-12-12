import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class PerpendicularLinesTest {
    @Test
    public void basicTests() {
        assertEquals(0, PerpendicularLines.maxBisectors(0));
        assertEquals(0, PerpendicularLines.maxBisectors(1));
        assertEquals(1, PerpendicularLines.maxBisectors(2));
        assertEquals(2, PerpendicularLines.maxBisectors(3));
        assertEquals(4, PerpendicularLines.maxBisectors(4));
        assertEquals(6, PerpendicularLines.maxBisectors(5));
        assertEquals(9, PerpendicularLines.maxBisectors(6));
        assertEquals(650, PerpendicularLines.maxBisectors(51));
    }
}