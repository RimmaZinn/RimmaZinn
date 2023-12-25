public class Task21 {
    //Напечатать числа в виде следующей таблицы:
    //1 2 ... 10
    //1 2 ... 10
    //1 2 ... 10
    //1 2 ... 10

    public static void main(String[] args) {
int a =1;
print(a);
        System.out.println();
        print(a);
        System.out.println();
        print(a);
        System.out.println();
        print(a);
    }
    public static void print(int a) {
        if (a<=10) {
            System.out.printf("%d ", a );
            a++;
            print(a);
        }
    }
}
