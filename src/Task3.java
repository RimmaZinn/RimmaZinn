public class Task3 {
    public static void main(String[] args) {
        int number = 39;
        int decimls = 39/10;
        int units = 39%10;
        System.out.println(decimls);
        System.out.println(units);
        int sum = decimls+units;
        int product = decimls*units;
        System.out.printf(
                "Кол-во десятков -%d, кол-во единиц-%d, произведение цифр - %d, сумма цифр - %d",
                decimls,
                units,
                product,
                sum
                );
    }
}
