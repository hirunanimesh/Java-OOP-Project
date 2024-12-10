package Character;

abstract public class Knight extends character {

    public Knight(int attack, int defence , double health , int speed, int price){
        super (attack,defence , health ,speed , price);
    }

    @Override
    public String getSupName() {
        return "Knight";
    }
}
