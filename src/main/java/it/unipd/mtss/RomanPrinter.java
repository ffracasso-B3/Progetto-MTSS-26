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
        
        String numerals = "IVXLCD"; // supporta I, V, X, L, C e M

        // String array bidimensionale per le asciiart
        String[][] asciiArts = {

             { " _____ ", " _   _ ", "__   __",         // riga 1: I, V, X, L, C, D e M
                    " _      ", "  _____ ", " _____  ",  "__  __"}, 
             { "|_   _|", "| | | |", "\\ \\ / /",       // riga 2
                    "| |     ", " / ____|", "|  __ \\", "|  \\/  |"}, 
             { "  | |  ", "| | | |", " \\ V / ",        // riga 3
                    "| |     ", "| |     ", "| |  | |", "| \\  / |"}, 
             { "  | |  ", "| | | |",  "  > <  ",        // riga 4
                    "| |     ", "| |     ", "| |  | |", "| |\\/| |"}, 
             { " _| |_ ", " \\ V / ", " / . \\ ",       // riga 5
                    "| |____ ", "| |____ ", "| |__| |", "| |  | |"}, 
             { "|_____|", "  \\_/  ", "/_/ \\_\\",      // riga 6
                    "|______|", " \\_____|", "|_____/", "|_|  |_|"}  
            
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
