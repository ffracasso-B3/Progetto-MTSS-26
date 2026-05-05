////////////////////////////////////////////////////////////////////
// [FERDINANDO] [FRACASSO] [2122649]
// [ALESSIO] [SILVESTRINI] [2111032]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {

        // PREcondizione
        if (number < 1 || number > 20) {
        throw new IllegalArgumentException("Sono ammessi solo numeri da 1 a 20.");
    }
        // stringa con i valori base e sottrattivi in int
        int[] values = {10, 9, 5, 4, 1}; 

        // stringa con i valori base e sottrattivi in roman
        String[] symbols = {"X", "IX", "V", "IV", "I"}; 

        StringBuilder convertedNumber = new StringBuilder();
        
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                convertedNumber.append(symbols[i]);
                number -= values[i];
            }
        }

        return convertedNumber.toString();
    }
}
