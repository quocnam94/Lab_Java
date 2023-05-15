import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtiltiesTest {
    private Utilties util;
    @Before
    public void setup (){
        util = new Utilties();
    }
    @Test
    public void everyNthChar() throws Exception {
        char [] output = util.everyNthChar(new char[]{'h', 'e', 'l','l', 'o'},2);
        assertArrayEquals(new char[]{'e', 'l'}, output);
        char [] output2 = util.everyNthChar(new char[]{'h', 'e', 'l','l', 'o'},8);
        assertArrayEquals(new char[]{'h', 'e', 'l','l', 'o'}, output2);

    }

    @Test
    public void removePairs() throws Exception {
        assertEquals("ABCDEF",util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
    }

    @Test
    public void converter() throws Exception {
        Utilties util = new Utilties();
        assertEquals(300,util.converter(10,5));
    }
    @Test(expected=ArithmeticException.class )
    public void converter_arithmeticException() throws Exception {
        util.converter(10,0);
    }
    @Test
    public void nullIfOddLength() throws Exception {
        assertNull(util.nullIfOddLength("odd"));
        assertNotNull(util.nullIfOddLength("even"));
    }
}