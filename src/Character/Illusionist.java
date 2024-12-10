package Character;

public class Illusionist extends Mage {
    private int r=0;
    private String name;
    private  String SupName;
    public Illusionist (int attack, int defence , double health , int speed, int price){
        super (attack,defence , health ,speed , price);
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSupName() {
        return SupName;
    }
    public void setSupName(String SupName){
        this.SupName = SupName;

    }

}
