public class Task18 {
    // 5
    // 55
    // 555
    // 5555
    public static void main(String[] args) {
        int count=4;
        printPyramid(5, 4);
        System.out.println();
        printPyramid(5, 3);
        System.out.println();
        printPyramid(5, 2);
        System.out.println();
                    }
                    public static void printPyramid(int number, int count) {
                        if (count > 0) {
                            count--;
                            System.out.print(number + " ");
                            printPyramid(number, count);
                        }
                    }
                    }


