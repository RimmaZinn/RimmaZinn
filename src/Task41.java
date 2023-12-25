import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.deepToString;

public class Task41 {
    //4. Дан массив. Вывести на экран сначала его неотрицательные элементы, затем отрицательные.
    public static void main(String[] args) {

            Double array[] = new Double[20];
            Random r = new Random();

            for (int i = 0; i < array.length; i++) {
                array[i] = r.nextDouble(-20, 20);
            }
            System.out.println(deepToString(array));

            for (int i = 0; i < array.length; i++) {
                if (array[i] >= 0) {
                    System.out.print(array[i] + " ");
                }
            }

            System.out.println();

            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
