import java.util.Scanner;

public class Task31 {
    //Составить программу вывода любого числа любое заданное число раз.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое число ");
        int number = sc.nextInt();
        System.out.println("Введите количество чисел ");
        int count = sc.nextInt();
        for (int i =0; i<count; i++) {
            System.out.print(number + " ");
        }

    }
}
