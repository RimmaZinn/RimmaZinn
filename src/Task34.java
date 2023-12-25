import java.util.Scanner;

public class Task34 {
    // 4. Вычислить сумму 1+1/2+1/3+...+1/n

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n");
        double sum = 0;
        int n = sc.nextInt();
           for (double i = 1; i <= n; i++) {
               sum = sum + (1 / i);
           }
               System.out.println(sum);

    }
    }


