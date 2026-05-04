////////////////////////////////////////////////////////////////////
// [FERDINANDO] [FRACASSO] [2122649]
// [ALESSIO] [SILVESTRINI] [2111032]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {

        // PREcondizione
        if (number < 1 || number > 6) { //funzionerebbe fino a 8, ma accetto i primi 6 come da consegna
        throw new IllegalArgumentException("Sono ammessi solo numeri da 1 a 6.");
    }

        int[] values = {5, 4, 1}; // stringa con i valori base e sottrattivi in int
        String[] symbols = {"V", "IV", "I"}; // stringa con i valori base e sottrattivi in roman

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
