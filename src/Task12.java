import java.util.Scanner;
//Даны радиус круга и сторона квадрата.У какой фигуры площадь больше?
public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус круга и сторону квадрата");
        int r = sc.nextInt();
        int l = sc.nextInt();
        sc.close();

        if ((r*2*Math.PI) > (l*l)) {
            System.out.println("Площадь круга больше площади квадрата");
        } else if ((r*2*Math.PI) < (l*l)) {
            System.out.println("Площадь круга меньше площади квадрата");
        } else {
            System.out.println("Площадь круга и площадь квадрата равны");

        }

    }
}



