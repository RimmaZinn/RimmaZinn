package zoo;
//м.б.голодным и покусанным
//4) обедает
//5) следит за белками
//6) должен наложить себе повязку
public abstract class Human {
    boolean hungry;
    boolean hurt;

    String profession;
    abstract void lunch();
    abstract void watch(Squirrels squirrel);
    abstract void makeBandage();

}
