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

    // test per le asciart
    
    // verifico I (1) venga stampato correttamente in asciart
    @Test
    public void shouldPrintAscii_One() {
      String expected = String.join(System.lineSeparator(), // System.lineSeparator è un metodo per separare le righe e rendere più leggibile il codice
          " _____",
          "|_   _|",
          "  | |",
          "  | |",
          " _| |_",
          "|_____|");

      assertEquals(expected, RomanPrinter.print(1));
    }

    // verifico V (5) venga stampato correttamente in asciart
    @Test
    public void shouldPrintAscii_Five() {
      String expected = String.join(System.lineSeparator(),
          "__      __",
          "\\ \\    / /",
          " \\ \\  / /",
          "  \\ \\/ /",
          "   \\  /",
          "    \\/");

      assertEquals(expected, RomanPrinter.print(5));
    }

    // verifico X (10) venga stampato correttamente in asciart
    @Test
    public void shouldPrintAscii_Ten() {
      String expected = String.join(System.lineSeparator(),
          "__   __",
          "\\ \\ / /",
          " \\ V /",
          " /   \\",
          "/ /^\\ \\",
          "\\/   \\/");

      assertEquals(expected, RomanPrinter.print(10));
    }

    // verifico L (50) venga stampato correttamente in asciart
    @Test
    public void shouldPrintAscii_Fifty() {
      String expected = String.join(System.lineSeparator(),
          " _",
          "| |",
          "| |",
          "| |",
          "| |____",
          "|______|");

      assertEquals(expected, RomanPrinter.print(50));
    }

    // verifico C (100) venga stampato correttamente in asciart
    @Test
    public void shouldPrintAscii_Hundred() {
      String expected = String.join(System.lineSeparator(),
          "  _____",
          " / ____|",
          "| |",
          "| |",
          "| |____",
          " \\_____|");
  
      assertEquals(expected, RomanPrinter.print(100));
    }

    // verifico D (500) venga stampato correttamente in asciart
    @Test
    public void shouldPrintAscii_FiveHundred() {
      String expected = String.join(System.lineSeparator(),
          " _____",
          "|  __ \\",
          "| |  | |",
          "| |  | |",
          "| |__| |",
          "|_____/");

          assertEquals(expected, RomanPrinter.print(500));
    }

    // verifico M (1000) venga stampato correttamente in asciart
    @Test
   public void shouldPrintAscii_OneThousand() {
      String expected = String.join(System.lineSeparator(),
          " __  __",
          "|  \\/  |",
          "| \\  / |",
          "| |\\/| |",
          "| |  | |",
          "|_|  |_|");
 
      assertEquals(expected, RomanPrinter.print(1000));
    }

    
}
