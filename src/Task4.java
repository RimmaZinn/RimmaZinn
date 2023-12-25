import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //длина окружности l = 2*Pir
        //short r = 4;
        System.out.println("Введите радиус");
        Scanner sc = new Scanner(System.in);
        short r = sc.nextShort();
        double l = 2 * r * Math.PI;
        System.out.println("Длина окружности = " + l);
    }
}
