package pepcoding;

public class TargetSumSubset {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        printTargetSubSet(array, 0, "", 0, 70);
    }

    private static void printTargetSubSet(int[] inputArray, int index, String set, int sumOfSubSet, int targetSum) {
        if(index == inputArray.length) {
            if(sumOfSubSet == targetSum)
                System.out.println(set + ".");

            return;
        }

        printTargetSubSet(inputArray, index + 1, set + inputArray[index] + ", ",
                sumOfSubSet + inputArray[index], targetSum);

        printTargetSubSet(inputArray, index + 1, set, sumOfSubSet, targetSum);
    }
}
