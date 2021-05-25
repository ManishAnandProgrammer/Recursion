package pepcoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class KeypadCombination {
    private static final Map<String, String> wordMap =
            Map.of("1", "abc", "2", "def", "3", "ghi", "4", "jkl");

    public static void main(String[] args) {
        System.out.println(letterCombination(""));
    }

    public static List<String> letterCombination(final String keypadPressed) {
        if(keypadPressed.length() == 0) {
            return new ArrayList<>();
        }

        if(keypadPressed.length() == 1) {
            String charsAgainstKeyPressed = wordMap.get(keypadPressed);
            List<String> baseCaseList = new ArrayList<>();
            for(int i = 0; i < charsAgainstKeyPressed.length(); i++) {
                baseCaseList.add(charsAgainstKeyPressed.charAt(i)+"");
            }
            return baseCaseList;
        }
        String firstKeyPressed = keypadPressed.charAt(0)+"";
        String remainingKeys = keypadPressed.substring(1);
        List<String> remainingLetterCombinations =
                letterCombination(remainingKeys);


        String firstKeyValues = wordMap.get(firstKeyPressed);
        List<String> listToReturn = new ArrayList<>();
        for(int i = 0; i < firstKeyValues.length(); i++) {
            for(String str: remainingLetterCombinations) {
                listToReturn.add(firstKeyValues.charAt(i)+str);
            }
        }
        return listToReturn;
    }
}
