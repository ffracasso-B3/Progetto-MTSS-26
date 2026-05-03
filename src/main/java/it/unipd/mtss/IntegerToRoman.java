////////////////////////////////////////////////////////////////////
// [FERDINANDO] [FRACASSO] [2122649]
// [ALESSIO] [SILVESTRINI] [2111032]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        String convertedNumber = "";
        while(number > 1) {
            convertedNumber += "I";
            number -= 1;
        }

        return convertedNumber;
    }
}
