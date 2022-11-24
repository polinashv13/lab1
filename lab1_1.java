import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class lab1_1 {
    public static void main(String[] args) {
        Calendar calen = new GregorianCalendar();
        int day_c = calen.get(Calendar.DAY_OF_MONTH);
        int month_c = calen.get(Calendar.MONTH) +1;
        int year_c = calen.get(Calendar.YEAR);
        Scanner scan = new Scanner(System.in);
        System.out.println("День рождения: ");
        int day_b = scan.nextInt();
        if (day_b < 1 || day_b > 31){
            System.out.println("День введен неправильно!");
            return;
        }
        System.out.println("Месяц рождения: ");
        int month_b = scan.nextInt();
        calen.set(2022, month_b - 1, 2);
        if (month_b < 1 || month_b > 12 || day_b > calen.getActualMaximum(Calendar.DAY_OF_MONTH)) {
            System.out.println("Месяц введен неправильно!");
            return;
        }
        System.out.println("Год рождения: ");
        int year_b = scan.nextInt();
        if(year_b < 1 || year_b > 2022){
            System.out.println("Год введен неправильно!");
            return;
        }
        if (day_c < day_b) {
            month_c -= 1;
            calen.set(2022, month_c - 1, 2);
            day_c += calen.getActualMaximum(Calendar.DAY_OF_MONTH);
        }

        if (month_c < month_b) {
            year_c -= 1;
            month_c += 12;
        }

        System.out.printf(" %d лет, %d месяцев, %d дней", (year_c - year_b), (month_c - month_b), (day_c - day_b));
        scan.close();
    }
}