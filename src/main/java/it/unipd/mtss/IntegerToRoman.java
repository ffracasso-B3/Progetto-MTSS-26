////////////////////////////////////////////////////////////////////
// [FERDINANDO] [FRACASSO] [2122649]
// [ALESSIO] [SILVESTRINI] [2111032]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        StringBuilder convertedNumber = new StringBuilder();
        while(number > 0) {
            convertedNumber.append("I");
            number -= 1;
        }

        return convertedNumber.toString();
    }
}
