public class Main {
    public static void checkYear(int year) {
        if ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }
    public static void checkOS(int OS, int checkYearPhone) {
        if (OS != 0 && checkYearPhone > 2014){
            System.out.println("у тебя андроид все норм");
            return;
        } else if (OS == 0 && checkYearPhone > 2014) {
            System.out.println("У тебя айфон все норм");
        } else if (OS != 0 && checkYearPhone < 2015) {
            System.out.println("У тебя андроид поставь легче версию");
        } else if (OS == 0 && checkYearPhone < 2015) {
            System.out.println("У тебя айфон поставь легче верию");
        }
    }
    public static void delivery(int checkDelivery) {
        if (checkDelivery < 20) {
            System.out.println("Сутки");
        } else if (checkDelivery >= 20 && checkDelivery < 60) {
            System.out.println("сутки плюс день");
        } else if (checkDelivery >= 60 && checkDelivery < 100) {
            System.out.println("сутки плюс 2 дня");
        }
    }
    public static void main(String[] args) {
        checkYear(2013);
        checkOS(1, 2013);
        delivery(95);
    }
}