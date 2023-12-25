import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task35 {
    // Заполнить массив из десяти элементов значениями, вводимыми с клавиатуры в ходе выполнения программы.
    // Составить программу:
    //1. расчета квадратного корня из любого элемента массива;
    //2. расчета среднего арифметического двух любых элементов массива
    public static void main(String[] args) {
        int[] array = new int[10];


        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Введите номер элемента для поиска кв.корня");
        System.out.println("Кв.корень = " + sqrt(array[sc.nextInt()]));

        System.out.println("Введите два номера элемента для поиска среднеарифметического значения");
        System.out.println("Среднеарифметическое значение = " + avg(array[sc.nextInt()],array[sc.nextInt()]));
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static double sqrt(int element) {
        return Math.sqrt(element);
    }
    public static double avg(int element1, int element2) {
        return (element1+element2)/2.0;
    }

    }
