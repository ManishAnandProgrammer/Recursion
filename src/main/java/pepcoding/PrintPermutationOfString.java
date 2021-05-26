package pepcoding;

public class PrintPermutationOfString {
    public static void main(String[] args) {
        printPermute("abc", "");
    }

    private static void printPermute(String input, String answer) {
        if(input.length() == 0) {
            System.out.println(answer);
            return;
        }

        for(int i = 0; i < input.length(); i++) {
            String charAtIndex = input.charAt(i) + "";

            String preSubString = input.substring(0, i);
            String postSubString = input.substring(i+1);

            String stringAfterRemovingIndexChar = preSubString + postSubString;
            printPermute(stringAfterRemovingIndexChar, answer + charAtIndex);
        }
    }
}
