package Character;

public  class Artefact {
    private int attack,speed , defence, price;
    private double health;
    public Artefact(int price , int attack , int defence , double health , int speed){
        this.price = price ;
        this.attack = attack ;
        this.defence = defence;
        this.health = health;
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public double getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }
}
