package Character;

abstract public class character {
    public String name;
    public double health;
    public int  attack ,defence  ,speed , price;
    public String supName;


    public character( int attack, int defence , double health , int speed, int price){
        this.speed = speed;
        this.attack = attack;
        this.defence = defence;
        this.health = health;
        this.price = price ;

    }

    public abstract int getR();
    //public abstract void getName();

    public abstract void setR(int i);

    public abstract String getName();
    public abstract void  setName(String name);
    public abstract String getSupName();
    public abstract void  setSupName(String name);


    /*public void getattack (){
        System.out.println(this.attack);
    }*/
};