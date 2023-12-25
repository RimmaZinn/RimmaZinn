package zoo;

//м.б.голодным и покусанным
// 1) обходит каждое животное и проверяет его действие
// 2) помещает в карантин, изолируя от остальных животных
// 3) возвращает животное в обычный вольер
//4) обедает
//5) следит за белками
//6) должен наложить себе повязку
public class Veterinarian extends Human{
    void lunch() {
        if (hungry){
            System.out.println("Ветеринар пообедал");
            hungry=false;
        }else {
            System.out.println("Ветеринар еще не голоден");
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
            System.out.println("Ветеринар наложил себе повязку");
            hurt=false;
        }else {
            System.out.println("Ветеринара еще не кусали");
        }
        }

    public void chekHealth(Animal animal){
        if (!animal.healthy){
        animal.cage="";
        System.out.println("Помещен в карантин");
    }

        }


    public Veterinarian(){
        this.profession = "Ветеринар";
    }
}
