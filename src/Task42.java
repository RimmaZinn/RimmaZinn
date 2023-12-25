import java.util.Random;

public class Task42 {
    //5. Дан массив. Определить:
    //1. количество максимальных элементов в массиве;
    //2. количество минимальных элементов в массиве

    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[r.nextInt(4, 10)];

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(-100, 100);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
            System.out.println("\nMax = " + max);
            System.out.println("Min = " + min);
        }
    }



