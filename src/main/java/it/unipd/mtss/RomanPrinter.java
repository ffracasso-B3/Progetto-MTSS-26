////////////////////////////////////////////////////////////////////
// [FERDINANDO] [FRACASSO] [2122649]
// [ALESSIO] [SILVESTRINI] [2111032]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        StringBuilder asciiPrint = new StringBuilder();
        
        String numerals = "I";

        // String array bidimensionale per le asciiart
        String[][] asciiArts = {
            //Riga 1
            {
                " _____ " // I
            },
            //Riga 2
            {
                "|_   _|" // I
            },
            //Riga 3
            {
                "  | |  " // I
            },
            //Riga 4
            {
                "  | |  " // I
            },
            //Riga 5
            {
                " _| |_ " // I
            },
            //Riga 6
            {
                "|_____|" // I
            }
            
        };

        // Aggiungi una riga alla volta
        for(int i = 0; i < 6; i++) {
            // Itera su romanNumber, aggiunge riga art corrispondente al char
            for(int j = 0; j < romanNumber.length(); j++) {
                int charIndex =numerals.indexOf(romanNumber.charAt(j));
                asciiPrint.append(asciiArts[i][charIndex]);
            }
            //Una volta finita una iterazione passa alla riga successiva
            asciiPrint.append("\n");
        }
        
        return asciiPrint.toString();
    }
}
