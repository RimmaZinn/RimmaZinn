import java.util.Scanner;

public class Task13 {
    //Дано двузначное число.Определить:остаток от деления десятков на единицы,результат деления единиц на десятки
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите двузначное число");
        int number = sc.nextInt();
        sc.close();

        int units = number % 10;
        double decimals = number / 10;
        System.out.println("результат деления десятков на единицы = " + (decimals / units));
        System.out.println("результат деления единиц на десятки = " + (units / decimals));
    }
}
