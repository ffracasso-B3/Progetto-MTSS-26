////////////////////////////////////////////////////////////////////
// [FERDINANDO] [FRACASSO] [2122649]
// [ALESSIO] [SILVESTRINI] [2111032]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {
    
    @Test
    public void testConvert() {
        String one = IntegerToRoman.convert(1);
        String two = IntegerToRoman.convert(2);
        String three = IntegerToRoman.convert(3);

        assertEquals(one, "I");
        assertEquals(two, "II");
        assertEquals(three, "III");
    }
}
