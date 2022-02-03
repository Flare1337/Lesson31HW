import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DividerTest {
    @Test
    public void positiveDividerTest() {
        assertTrue(DividerByThree.isDivide("123"));
        assertTrue(DividerByThree.isDivide("0"));
        assertTrue(DividerByThree.isDivide("93"));
        assertTrue(DividerByThree.isDivide("6666"));
        assertTrue(DividerByThree.isDivide("3"));
    }

    @Test
    public void negativeDividerTest() {
        assertFalse(DividerByThree.isDivide("4"));
        assertFalse(DividerByThree.isDivide("52"));
        assertFalse(DividerByThree.isDivide("001"));
        assertFalse(DividerByThree.isDivide("34"));
        assertFalse(DividerByThree.isDivide("100"));
    }
}
