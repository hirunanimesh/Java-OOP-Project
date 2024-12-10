package Character;

public class Shooter extends Archer {
    private int r=0;
    private String name;
    private String SupName;
    public Shooter (int attack , int defence , double health , int speed , int price){
        super (attack, defence , health , speed , price );
    }
    /*public void getattack(){
        System.out.println(attack);
    }*/

    @Override
    public void setR(int r) {
        this.r = r;
    }

    @Override
    public int getR() {
        return r;
    }


    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;

    }
    public String getSupName() {
        return SupName;
    }
    public void setSupName(String SupName){
        this.SupName = SupName;

    }



}
