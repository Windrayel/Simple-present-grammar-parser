import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void isDerivable() {
        assertTrue(Main.isDerivable("c"));
        assertTrue(Main.isDerivable("cbc"));
        assertTrue(Main.isDerivable("cbcadce"));

        assertFalse(Main.isDerivable("abcde"));
        assertFalse(Main.isDerivable("rmk"));
        assertFalse(Main.isDerivable("cbcaa"));
    }
}