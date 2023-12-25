package phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1=new Phone();
        Phone phone2=new Phone(5334908,"Nokia",30);
        Phone phone3=new Phone(2974386,"Huawei",20);

        phone1.setNumber(5334286);
        phone1.model="Sony";
        phone1.weight= 43;
        phone1.setName("Алексей");
        phone2.setName("Александр");
        phone3.setName("Алла");

        System.out.println("Параметры телефона 1: ");
        System.out.println("Номер телефона: "+phone1.getNumber());
        System.out.println("Модель телефона: "+phone1.model);
        System.out.println("Вес телефона: "+phone1.weight);
        System.out.println("\nПараметры телефона 2: ");
        System.out.println("Номер телефона: "+ phone2.getNumber());
        System.out.println("Модель телефона: "+phone2.model);
        System.out.println("Вес телефона: "+phone2.weight);
        System.out.println("\nПараметры телефона 3: ");
        System.out.println("Номер телефона: "+ phone3.getNumber());
        System.out.println("Модель телефона: "+phone3.model);
        System.out.println("Вес телефона: "+phone3.weight);
        System.out.println();
        phone1.receiveCall();
        phone2.receiveCall();
        phone3.receiveCall();
        }
}
