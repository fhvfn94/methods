public class Main {
    public static void checkYear(int year) {
        if ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }
    public static void main(String[] args) {
        int a = 2023;
        checkYear(a);
    }
}