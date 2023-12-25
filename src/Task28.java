public class Task28 {
    //Имеется фрагмент программы в виде оператора цикла с параметром,
    //обеспечивающий вывод на экран "столбиком" всех целых чисел от 10 до 30.
    //Оформить этот фрагмент в виде:
    //1. оператора цикла с предусловием;
    //2. оператора цикла с постусловием.

    public static void main(String[] args) {
        int start = 10;
    do {
        System.out.println(start);
        start++;
    } while (start<30);

    int starWhile = 10;
    while (starWhile<30) {
        System.out.println(starWhile);
        starWhile++;
    }
    }
}
