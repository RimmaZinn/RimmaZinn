package phone;

public class Phone {

    //Создайте класс Phone, который содержит переменные number, model и weight.
    private int number;
    String model;
    int weight;
    private String name;

    //Добавьте в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
    // Выводит на консоль сообщение “Звонит {name}”.
    // Метод getNumber – возвращает номер телефона.

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void receiveCall() {
        System.out.println("Звонит "+name + ", телефон: " +getNumber());
        }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Phone(){
    }

    public Phone(int number,String model,int weight) {
       this.number=number;
       this.model=model;
       this.weight=weight;
        }

}
