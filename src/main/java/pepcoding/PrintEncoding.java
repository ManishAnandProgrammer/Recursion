package pepcoding;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintEncoding {
    private static final Map<String, String> wordMap;

    static {
        wordMap = new LinkedHashMap<>();
        for(int i = 1, j = 'a' ; i <= 26; i++, j++) {
            wordMap.put(i+"", String.valueOf((char) j));
        }
    }

    public static void main(String[] args) {
        //System.out.println(wordMap);
        printEncoding("1012", "");
    }

    private static void printEncoding(String input, String answer) {

        if(input.length() == 0) {
            System.out.println(answer);
            return;
        }

        String firstChar = input.charAt(0) + "";
        if(wordMap.containsKey(firstChar)) {
            String remainingStringAfterFirstChar = input.substring(1);

            printEncoding(remainingStringAfterFirstChar, answer + wordMap.get(firstChar));

            if(input.length() >= 2) {
                String firstTwoChar = input.substring(0, 2);
                if(wordMap.containsKey(firstTwoChar)) {
                    String remainingStringAfterFirstTwoChar = input.substring(2);
                    printEncoding(remainingStringAfterFirstTwoChar, answer + wordMap.get(firstTwoChar));
                }
            }
        }
    }
}
