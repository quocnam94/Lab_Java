import org.junit.Test;

import static org.junit.Assert.*;

public class UtiltiesTest {

    @Test
    public void everyNthChar() {
        fail("Fail");
    }

    @Test
    public void removePairs() {
        Utilties util = new Utilties();
        assertEquals("ABCDEF",util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
    }

    @Test
    public void converter() {
        fail("Fail");
    }

    @Test
    public void nullIfOddLength() {
        fail("Fail");
    }
}