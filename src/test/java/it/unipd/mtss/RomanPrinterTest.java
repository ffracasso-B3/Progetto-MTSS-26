////////////////////////////////////////////////////////////////////
// [FERDINANDO] [FRACASSO] [2122649]
// [ALESSIO] [SILVESTRINI] [2111032]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanPrinterTest {
    
    @Test
    public void testPrinter() {

        assertEquals(" _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|\n", RomanPrinter.print(1));
        assertEquals(" _   _ \n| | | |\n| | | |\n| | | |\n \\ V / \n  \\_/  \n", RomanPrinter.print(5));
        assertEquals("__   __\n\\ \\ / /\n \\ V / \n  > <  \n / . \\ \n/_/ \\_\\\n", RomanPrinter.print(10));
    }
}
