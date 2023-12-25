import java.util.Scanner;
//В чемпионате по футболу команде за выигрыш дается 3 очка,за проигрыш—0,за ничью—1.Известно количество очков,полученных командой за игру.
// Определить словесный результат игры (выигрыш,проигрыш или ничья)
public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество очков: 0, 1, 3");
        int point = sc.nextInt();
        sc.close();

        switch (point) {
            case 0:
                System.out.println("Проигрыш");
                break;
            case 1:
                System.out.println("Ничья");
                break;
            case 3:
                System.out.println("Выигрыш");
                break;
            default:
                System.out.println("Введено некорректное количество очков");
        }
    }
}

