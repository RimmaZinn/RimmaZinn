public class Task1 {
    public static void main(String[] args) {
//тип данных, название переменной
        int number = 5;
        short dijit = 1;
        dijit = 3;
        dijit = 'c'; // преобразование в число 99

        final String string1 = "Hello world";

        //типы данных
        byte byte1 = 1;
        short value = 70;
        int value2 = 1000000;
        long value3 = -1000000000;
        //символ
        char value4 = ')';
        String value5 = "Hello!!! World!!!";

boolean bool = true;
double value6 = 5.22;
float value7 = 56.2565689f; // ставим f в конце

//арифметические операции
        int sum = 2+2;
        int result = 20-5;
        int result1 = 3*5;
        int del = 20/4; //5
        int del1 = 21/4; //5-остается целая часть
        int del3 = 21%4; //1 - остаток от деления
        int result2 = 2*(3+5);
        int increment = 1;
        increment++; // increment = increment +1
        ++increment;
        int sum3=2-increment++; //2-1+1
        int sum4=2- ++increment; // 2-(1+1)

        System.out.println(sum3);
        System.out.print(result2 + " "); //добавляем пробел (приклеиваем)
        System.out.print(result + " ");
        System.out.printf("I am %d years old", 39);
        System.out.println(dijit); //dijit = 'c'; преобразование в число 99

        double result6 = 5/4.0; // 1 число должно быть double
        System.out.println(result6);
        int result7 = (int)56.7;
        System.out.println(result7);




    }
}
