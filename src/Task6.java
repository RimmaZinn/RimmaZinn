import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3-х значное число");
        int number = sc.nextInt();
        //123 % 10 = 3 (120/10, а 3 не делится)
        int units = number % 10;
        // 123/10 = 12
        int decimals = (number / 10) % 10;
        int hungred = (number / 10) / 10;
        System.out.println("Сумма цифр = " + (units+decimals+hungred));
        System.out.println("Произведение цифр = " + (units*decimals*hungred));

    }
}
