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
        StringBuilder asciiArt = new StringBuilder();
        
        String availableCharacters = "I";

        // Rappresentazione come array bidimensionale delle art per i vari caratteri
        String[][] asciiCharacters = {
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
            // Itera sulla String di numeri romani, aggiungendo la riga dell'art corrispondente al carattere attuale
            for(int j = 0; j < romanNumber.length(); j++) {
                asciiArt.append(asciiCharacters[i][availableCharacters.indexOf(romanNumber.charAt(j))]);
            }
            //Una volta finita una iterazione passa alla riga successiva
            asciiArt.append("\n");
        }
        
        return asciiArt.toString();
    }
}
