package pepcoding;

public class PrintSubSequence {
    public static void main(String[] args) {
        printSubSequence("abc", "");
    }

    private static void printSubSequence(String input, String answer) {
        if(input.length() == 0) {
            System.out.print(answer + ", ");
            return;
        }

        char charAtZero = input.charAt(0);
        String restOfString = input.substring(1);

        printSubSequence(restOfString, answer + "");
        printSubSequence(restOfString, answer + charAtZero);
    }
}
