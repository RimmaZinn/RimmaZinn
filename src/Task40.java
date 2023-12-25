import java.util.Random;
import java.util.Scanner;

public class Task40 {
    // 1. Заполнить массив из двенадцати элементов 1, 2, ... 12.
    //2. Вывести элементы массива на экран в обратном порядке.
    //3. Определить:
    //1. сумму всех элементов массива;
    //2. произведение всех элементов массива;
    //3. сумму квадратов всех элементов массива;
    //4. сумму шести первых элементов массива

    public static void main(String[] args) {
        int[] array = new int[12];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 12; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < 12; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 11; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i<12; i++) {
            sum += array[i];
        }
        System.out.print("Сумма элементов массива = " + sum);
        System.out.println();

        int product = 1;
        for (int i = 0; i<12; i++) {
            product = product*array[i];
        }
        System.out.println("Произведение элементов массива = " + product);
        System.out.println();

        double sqrt1 = 0;
        for (int i =0; i<12; i++) {
            sqrt1 = sqrt1 + Math.sqrt(array[i]);
        }
            System.out.println("Сумма квадратов всех элементов массива = " + sqrt1);
        System.out.println();

        int sum1 = 0;
        for (int i = 0; i<6; i++) {
            sum1 += array[i];
        }
        System.out.print("Сумма 6 элементов массива = " + sum1);

        }

    }



