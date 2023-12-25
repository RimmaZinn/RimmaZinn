import java.sql.SQLOutput;

public class Task16 {
    // 5 5 5 5 5 5
    // 5 5 5 5 5 5
    // 5 5 5 5 5 5
    public static void main(String[] args) {
      printNumberToLine(5);
        printNumberToLine(3);
        printNumberToLine((3+5));
    }
    public static void printNumberToLine(int a) {
        System.out.printf("%d %d %d\n", a, a, a);
    }

}
