public class Main {
    public static void printSeparator() {
        System.out.println("//////");
    }
    public static void getMethod(int b) {
        System.out.println(b);
    }
    public static void main(String[] args) {
        example();
    }

    public static void example() {
        int[] a = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8,};
        for (int i = 0; i < a.length; i++) {
            getMethod(a[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
    }
}