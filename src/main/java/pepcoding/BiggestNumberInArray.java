package pepcoding;

public class BiggestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {10, 11, 55, 23, 26, 54, 34, 5, 9, 64, 32};
        System.out.println(maxNumber(arr, 0));
    }

    private static int maxNumber(int[] arr, int index) {
        if(arr.length-1 == index)
            return arr[index];

        int max = maxNumber(arr, index+1);
        if(arr[index] > max) {
            return arr[index];
        } else {
            return max;
        }
    }
}
