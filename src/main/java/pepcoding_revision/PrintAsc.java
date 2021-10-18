package pepcoding_revision;

public class PrintAsc {
    public static void main(String[] args) {
        print(1, 100);
    }

    public static void print(int from, int to) {
        if(from == to) {
            System.out.println(from);
            return;
        }
        System.out.println(from);
        print(++from, to);
    }
}
