import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("День: ");
        int day = scan.nextInt();
        System.out.println("Месяц: ");
        int month = scan.nextInt();
        scan.close();
        if (day > 31) {
            System.out.println("Неподходящее значение дня");
        }
        String monthString;
        if (month == 1) {
            monthString = "Зима";
        } else if (month == 2) {
            monthString = "Зима";
        } else if (month == 3) {
            monthString = "Весна";
        } else if (month == 4) {
            monthString = "Весна";
        } else if (month == 5) {
            monthString = "Весна";
        } else if (month == 6) {
            monthString = "Лето";
        } else if (month == 7) {
            monthString = "Лето";
        } else if (month == 8) {
            monthString = "Лето";
        } else if (month == 9) {
            monthString = "Осень";
        } else if (month == 10) {
            monthString = "Осень";
        } else if (month == 11) {
            monthString = "Осень";
        } else if (month == 12) {
            monthString = "Зима";
        } else {
            monthString = "Ошибка";
        }
        System.out.println(monthString);
    }
}
