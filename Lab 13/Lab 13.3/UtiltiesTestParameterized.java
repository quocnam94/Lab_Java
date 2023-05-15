import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UtiltiesTestParameterized {
private Utilties util;
private String input;
private String output;

    public UtiltiesTestParameterized(String input, String output) {
        this.input = input;
        this.output = output;
    }
    @Before
    public void setup(){
        util = new Utilties();
    }
    @Parameterized.Parameters
    public static Collection<Object []>testConditions(){
        return Arrays.asList(new Object[][]{
            {"ABCDEFF","ABCDEF"},
            {"AB88EFFG","AB8EFG"},
            {"112233445566", "123456"},
            {"ZYZQQB", "ZYZQB"},
            {"A", "A"},
        });
    }
    @Test
    public void removePairs() throws Exception {
        assertEquals(output, util.removePairs(input));
    }
}
