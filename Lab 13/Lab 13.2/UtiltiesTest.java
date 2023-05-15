import org.junit.Test;

import static org.junit.Assert.*;

public class UtiltiesTest {

    @Test
    public void everyNthChar() {
        Utilties util = new Utilties();
        char [] output = util.everyNthChar(new char[]{'h', 'e', 'l','l', 'o'},2);
        assertArrayEquals(new char[]{'e', 'l'}, output);
        char [] output2 = util.everyNthChar(new char[]{'h', 'e', 'l','l', 'o'},8);
        assertArrayEquals(new char[]{'h', 'e', 'l','l', 'o'}, output2);

    }

    @Test
    public void removePairs() {
        Utilties util = new Utilties();
        assertEquals("ABCDEF",util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
    }

    @Test
    public void converter() {
        Utilties util = new Utilties();
        assertEquals(300,util.converter(10,5));
    }

    @Test
    public void nullIfOddLength() {
        Utilties util = new Utilties();
        assertNull(util.nullIfOddLength("odd"));
        assertNotNull(util.nullIfOddLength("even"));
    }
}