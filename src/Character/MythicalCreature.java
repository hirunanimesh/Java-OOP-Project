package Character;

abstract public class MythicalCreature extends character {

    public MythicalCreature (int attack, int defence , double health , int speed, int price){
        super (attack,defence , health ,speed , price);
    }

    @Override
    public String getSupName() {
        return "MythicalCreature";
    }
}
