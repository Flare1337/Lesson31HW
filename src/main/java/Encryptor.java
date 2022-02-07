import java.util.ArrayList;

public class Encryptor {

    public static int WHITE_SPACE_ASC2_CODE = 32;

    public static String encryptText(String someContent) {
        ArrayList<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        StringBuilder encryptedText = new StringBuilder();
        char[] symbols = someContent.toCharArray();
        for (int counter = 0; counter < (someContent.length() + 1); counter++) {
            if (someContent.length() != counter && symbols[counter] != WHITE_SPACE_ASC2_CODE) {
                word.append((symbols[counter]));
            }
            else {
                if (counter != someContent.length()) {
                    word.append(symbols[counter]);
                }
                words.add(encryptWord(word.toString()));
                word = new StringBuilder();
            }
        }
        for (String encryptedWord : words) {
            encryptedText.append(encryptedWord);
        }
        return encryptedText.toString();
    }

    private static String encryptWord(String word) {
        char[] wordInChars = word.toCharArray();
        char temp = 0;
        if (wordInChars.length > 1) {
            char secondSymbol = wordInChars[1];
            char lastSymbol = wordInChars[wordInChars.length - 1];
            if (lastSymbol == WHITE_SPACE_ASC2_CODE) {
                lastSymbol = wordInChars[wordInChars.length - 2];
            }
            wordInChars = replaceSymbols(wordInChars, temp, secondSymbol, lastSymbol);
        }
        return convertSymbolToASC(String.valueOf(wordInChars));
    }

    private static char[] replaceSymbols(char[] chars, char temp, char secondSym, char lastSym) {
        temp = secondSym;
        secondSym = lastSym;
        lastSym = temp;
        chars[1] = secondSym;
        if (chars[chars.length - 1] == WHITE_SPACE_ASC2_CODE) {
            chars[chars.length - 2] = lastSym;
        }
        else {
            chars[chars.length - 1] = lastSym;
        }
        return chars;
    }

    private static String convertSymbolToASC(String word) {
        int[] ASC2Codes = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77,
                           78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                           97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107,
                           108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118,
                           119, 120, 121, 122};
        StringBuilder builder = new StringBuilder(word);
        char[] symbols = builder.toString().toCharArray();
        for (Integer ASCode : ASC2Codes) {
            if (symbols[0] == ASCode) {
                builder.replace(0,1, ASCode.toString());
            }
        }
        return builder.toString();
    }
}
