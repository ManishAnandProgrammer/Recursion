package pepcoding;

public class PrintDecrease {
    public static void main(String[] args) {
        print(5);
    }

    private static void print(int number) {
        if(number == 0)
            return;

        System.out.println(number);
        print(number-1);
    }
}
