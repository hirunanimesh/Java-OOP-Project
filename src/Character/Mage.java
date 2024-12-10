package Character;

abstract public class Mage extends character {

    public Mage(int attack, int defence , double health , int speed, int price){
        super (attack ,defence , health ,speed , price);
    }

    @Override
    public String getSupName() {
        return "Mage";
    }
}
