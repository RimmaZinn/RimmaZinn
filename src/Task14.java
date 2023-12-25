import java.util.Scanner;

public class Task14 {
    //Даны три вещественных числа a,b,c.Проверить:1.выполняется ли неравенство a<b<c;2.выполняется ли неравенство b>a>c.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа a, b, c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        if ((a < b) && (b < c)) {
            System.out.println("выполняется неравенство a<b<c");
        }
        if ((b > a) && (a > c)) {
            System.out.println("выполняется неравенство b>a>c");
        }

    }
}

