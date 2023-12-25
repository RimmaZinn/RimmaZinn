import java.util.Random;
import java.util.Scanner;

public class Task43 {
    //6. Составить программу:
    //1. нахождения минимального значения среди элементов любой строки двумерного массива;
    //2. нахождения максимального значения среди элементов любого столбца двумерного массива
    public static void main(String[] args) {
        Random r = new Random();
        int[][] array2d = new int[r.nextInt(3, 4)][r.nextInt(3, 4)];

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d.length; j++) {
                array2d[i][j] = r.nextInt(20);
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер строки ");
        int n = sc.nextInt();
        int min = array2d[n][0];
            for (int j = 0; j < array2d.length; j++) {
                if (array2d[n][j] < min) {
                    min = array2d[n][j];
                }
            }
                System.out.println("Min = " + min);

        System.out.println("Введите номер столбца ");
        int n1 = sc.nextInt();
        int max = array2d[0][n1];
                for (int i = 0; i < array2d.length; i++) {
                   if (array2d[i][n1] > max) {
                max = array2d[i][n1];
            }
        }
        System.out.println("Max = " + max);
            }
        }


