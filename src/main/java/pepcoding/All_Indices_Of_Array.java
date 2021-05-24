package pepcoding;

public class All_Indices_Of_Array {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7,23,3,67,1,11,46,74,4,3,7};
        int[] all_Indices = all_Indices(arr, 3, 0, 0);
        for(int index: all_Indices) {
            System.out.println(index);
        }
    }

    private static int[] all_Indices(int[] array, int numberToCheck, int index, int foundSoFar) {
        if(index == array.length)
            return new int[foundSoFar];

        if(array[index] == numberToCheck) {
            int[] arr = all_Indices(array, numberToCheck, index+1, foundSoFar+1);
            arr[foundSoFar] = index;
            return arr;
        } else {
            int[] arr = all_Indices(array, numberToCheck, index+1, foundSoFar);
            return arr;
        }
    }
}
