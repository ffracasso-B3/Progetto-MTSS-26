package it.unipd.mtss;

import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertEquals; // per verificare l'uguaglianza tra due valori

import org.junit.Test;


public class AppTest 
{
    
    // verifico che i simboli base siano convertiti correttamente
    @Test
    public void shouldConvertBaseSymbols() { // verifico tutti i simboli possibili
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("X", IntegerToRoman.convert(10));
        assertEquals("L", IntegerToRoman.convert(50));
        assertEquals("C", IntegerToRoman.convert(100));
        assertEquals("D", IntegerToRoman.convert(500));
        assertEquals("M", IntegerToRoman.convert(1000));
    }

    // verifico che i casi di sottrazione siano convertiti correttamente
    @Test
    public void shouldConvertSubtractiveCases() { // verifico tutte le sottrazioni possibili
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("XC", IntegerToRoman.convert(90));
        assertEquals("CD", IntegerToRoman.convert(400));
        assertEquals("CM", IntegerToRoman.convert(900));
    }

    // verifico che i numeri composti siano convertiti correttamente
    @Test
    public void shouldConvertCompositeNumbers() { // verifico varie composizioni (fino a 1000)
        assertEquals("VI", IntegerToRoman.convert(6));
        assertEquals("XVI", IntegerToRoman.convert(16));
        assertEquals("LXVI", IntegerToRoman.convert(66));
        assertEquals("CLXVI", IntegerToRoman.convert(166));
        assertEquals("DCLXVI", IntegerToRoman.convert(666));  
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

    // verifico che l'eccezione sia lanciata per numeri maggiori di 1000
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowForGreaterThan1000() { // non accetto numeri >1000 (da consegna)
        IntegerToRoman.convert(1001);
    }
    
}
