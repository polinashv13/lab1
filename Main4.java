import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Число:");
        int x = scan.nextInt();
        System.out.println("Степень:");
        int n = scan.nextInt();
        if (n < -15 || n > 15) {
            System.out.println("допустимое значение: -15<n<15");
            return;
        }
        int con = x;

        if (n == 0) {
            x = 1;
            System.out.println(x);
        } else if (n > 1) {
            int i = 1;
            while (i < n) {
                con = con * x;
                i++;
            }
            System.out.println(con);
        } else if (n < 0) {
            for (int i = -1; i > n; i--) {
                con = con * x;
            }
            System.out.println(1.0 / con);
        } else if (n == 1) {
            System.out.println(con);
        }
    }
}