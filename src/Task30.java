import java.util.Scanner;

public class Task30 {
//Дано натуральное число.
//1. Определить его максимальную цифру
//2. Определить его минимальную цифру
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число ");
        int naturalNumber = sc.nextInt();
        int min = 9;
        int max = 0;
while (naturalNumber !=0) {
    int dijit = naturalNumber % 10;
    naturalNumber = naturalNumber/10;
    if (dijit>max) {
        max = dijit;
    }
    if (dijit<min) {
        min = dijit;
    }
}
        System.out.println("Max = " +max);
        System.out.println("Min = " +min);
    }
}
