import java.sql.SQLOutput;
import java.util.Scanner;
// true - если число >=5
// false - если число <5

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number = sc.nextInt(); // этот number не равен нижнему

        System.out.println("Результат " + greatrThan5(number));
    }

    public static boolean greatrThan5(int number) {
       boolean result = true;
                if (number < 5) {
            result = false;
        }
return result;
    }
}
