import java.util.Scanner;

public class Task23 {
    // Составить процедуру, "рисующую" на экране горизонтальную линию из любого
    //числа символов "*".
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество символов ");
        int n = sc.nextInt();
        sc.close();
        char a = '*';
        print(a,n);
            }

    public static void print(char a, int n) {
        if (n>0) {
            n--;
            System.out.print(a + " ");
            print(a, n);
        }
    }
}
