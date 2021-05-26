package pepcoding;

public class PrintStairsPath {
    public static void main(String[] args) {
        printPath(4, "");
    }

    private static void printPath(int numberOfStairs, String answer) {
        if(numberOfStairs == 0) {
            System.out.println(answer);
            return;
        } else if(numberOfStairs < 0) {
            return;
        }

        printPath(numberOfStairs-1, answer + 1);
        printPath(numberOfStairs-2, answer + 2);
        printPath(numberOfStairs-3, answer + 3);
    }
}
