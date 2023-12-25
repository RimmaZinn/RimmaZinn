public class Task33 {
    //3. Напечатать таблицу соответствия между весом в фунтах и весом в килограммах
    //для значений 1, 2, ..., 10 фунтов (1 фунт = 453 г).
    public static void main(String[] args) {
        for (double funt = 1; funt<=10; funt++) {
            System.out.println(funt + " фунт = " + (funt*453/1000) + " кг");
        }
    }
}
