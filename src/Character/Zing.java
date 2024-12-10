package Character;

public class Zing extends Archer {
    private int r=0;
    private String name;
    private String SupName;
    public Zing  (int attack, int defence , double health , int speed, int price){
        super (attack,defence , health ,speed , price);
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getSupName() {
        return SupName;
    }
    public void setSupName(String SupName){
        this.SupName = SupName;

    }


}
