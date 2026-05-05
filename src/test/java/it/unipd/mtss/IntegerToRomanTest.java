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
        // simboli base
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("X", IntegerToRoman.convert(10));
        assertEquals("L", IntegerToRoman.convert(50));

        // casi additivi
        assertEquals ("II", IntegerToRoman.convert(2));
        assertEquals ("VI", IntegerToRoman.convert(6));
        assertEquals ("XI", IntegerToRoman.convert(11));

        //casi sottrattivi
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("XLIX", IntegerToRoman.convert(49));
    }

    // verifico che l'eccezione sia lanciata per 0
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowForZero() { // lo 0 non esiste
        IntegerToRoman.convert(0);
    }

    // verifico che l'eccezione sia lanciata per numeri negativi
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowForNegative() { // non accetto numeri negativi
        IntegerToRoman.convert(-1);
    }

    // verifico che l'eccezione sia lanciata per numeri maggiori al massimo
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowForGreaterThanMax() { // non accetto numeri >1000 (da consegna)
        IntegerToRoman.convert(51);
    }

}
