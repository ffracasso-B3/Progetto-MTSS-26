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
        String I = RomanPrinter.print(1);
        assertEquals(I, " _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|\n");
    }
}
