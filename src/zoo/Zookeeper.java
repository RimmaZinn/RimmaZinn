package zoo;
//м.б.голодным и покусанным
//1) кормит всех животных
//2) вычесывает кошачьих
//3) меняет бегемоту воду
//4) обедает
//5) следит за белками
//6) должен наложить себе повязку
public class Zookeeper extends Human {
    @Override
    void lunch() {
if (hungry){
    System.out.println("Смотритель пообедал");
    hungry=false;
}else {
    System.out.println("Смотритель еще не голоден");
}
    }

    @Override
    void watch(Squirrels squirrel) {
        if (squirrel.cage == "вне вольера"){
            System.out.println("белка поймана");
            squirrel.cage = "в вольере";
        } else {
            System.out.println("Белка на месте");
        }

    }

    @Override
    void makeBandage() {
        if (hurt){
            System.out.println("Смотритель наложил себе повязку");
            hurt=false;
        }else {
            System.out.println("Смотрителя еще не кусали");
        }
    }
    public Zookeeper(){
        profession = "Смотритель";
    }
    }


