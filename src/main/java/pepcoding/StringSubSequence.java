package pepcoding;

import java.util.ArrayList;
import java.util.List;

public class StringSubSequence {
    public static void main(String[] args) {
        System.out.println(subSequence("abc"));
    }

    private static List<String> subSequence(String value) {
        if(value.length() == 0) {
            List<String> baseCase = List.of("");
            return baseCase;
        }

        char charAtZero = value.charAt(0);
        String restOfTheString = value.substring(1);
        List<String> resultOfRecursion = subSequence(restOfTheString);

        List<String> finalList = new ArrayList<>();
        for(String subSequence: resultOfRecursion) {
            finalList.add(subSequence);
        }

        for(String subSequence: resultOfRecursion) {
            finalList.add(charAtZero + subSequence);
        }

        return finalList;
    }
}
