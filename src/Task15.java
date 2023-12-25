import java.util.Scanner;

public class Task15 {
    //Даны два числа.Если квадратный корень из второго числа меньше первого числа,то увеличить второе число в пять раз.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = sc.nextInt();
        double b = sc.nextInt();
        sc.close();

        if ((Math.sqrt(b))<a){
            System.out.println((b*5));
        }
    }
}
