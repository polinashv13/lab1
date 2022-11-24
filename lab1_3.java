import java.util.Scanner;
public class lab1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Радиус:");
        float r = scan.nextFloat();
        System.out.println("Количество точек: ");
        int n = scan.nextInt();

        int hit = 0;
        for (int i = 0; i < n; i++){
            System.out.println("X:");
            float x = scan.nextFloat();
            System.out.println("Y:");
            float y = scan.nextFloat();
            if(x*x+y*y <= r*r) {
                hit++;
            }
        }
        System.out.println(hit+" точек попало в окружность");

    }
}

