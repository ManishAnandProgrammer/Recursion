package pepcoding;

import java.util.Map;

public class PrintKeyPadCombinations {
    private static final Map<String, String> wordMap =
            Map.of("1", "abc", "2", "def", "3", "ghi", "4", "jkl");

    public static void main(String[] args) {
        printKeyPadCombo("123", "");
    }

    private static void printKeyPadCombo(String input, String answer) {
        if(input.length() == 0) {
            System.out.println(answer);
            return;
        }

        char charAtZero = input.charAt(0);
        String restOfInput = input.substring(1);

        String codeForZerothChar = wordMap.get(charAtZero+"");
        for(int i = 0; i < codeForZerothChar.length(); i++) {
            printKeyPadCombo(restOfInput, answer+codeForZerothChar.charAt(i));
        }
    }
}
