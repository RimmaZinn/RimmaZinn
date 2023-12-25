import java.util.Scanner;

import static java.util.Arrays.deepToString;

public class Tasr44 {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<10; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(deepToString(array));
    }
}
