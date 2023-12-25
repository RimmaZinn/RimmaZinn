import java.util.Scanner;

public class Task27 {
//среднеарифметическое вещ.чисел а1, а2, ... аn
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n ");
        int n = sc.nextInt();

        double sum = 0;
     for (int i = 1; i<=n; i++) {
         System.out.println("Введите число ");
double number = sc.nextDouble();
sum += number;
     }
        System.out.print("Среднеарифметическое " + sum/n);
    }
}
