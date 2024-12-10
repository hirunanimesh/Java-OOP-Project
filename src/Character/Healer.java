package Character;

abstract public class Healer extends character {

    public Healer(int attack, int defence , double health , int speed, int price){
        super (attack,defence , health ,speed , price);
    }

    @Override
    public String getSupName() {
        return "Healer";
    }
}
