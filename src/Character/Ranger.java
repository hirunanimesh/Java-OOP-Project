package Character;

public class Ranger extends Archer {
    private int r=0;
    private String name;
    private String SupName;
    public Ranger (int attack , int defence , double health , int speed , int price ){
        super(attack,defence , health ,speed , price );
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
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
