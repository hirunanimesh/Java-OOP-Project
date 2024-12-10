import Character.*;

import java.util.*;


import java.awt.*;
import java.util.List;

public class Player {
    public static int userID = 0;
    public static int round =1 ;
    public String name ;
    private String userName;


    public int XP;
    public int goldCoins;
    public String homeground;
    public character archer;
    public character knight;
    public character mage;
    public character healer;
    public character mythicalCreature;
    //private List<character> Army = new ArrayList<character>();
    private Map<character , Integer> Army= new LinkedHashMap<character, Integer>();

    public Player(String name , String userName ,int XP ,int goldCoins){
        this.name = name ;
        this.userName = userName;
        this.XP = XP;
        this.goldCoins = goldCoins;
        userID += 1;
    }

    public void setHomeground(String homeground) {
        this.homeground = homeground;
    }
    public void setArcher(Archer archer){
        this.archer =archer;
    }
    public void setKnight(Knight knight){
        this.knight =knight;
    }
    public void setMage(Mage mage){
        this.mage =mage;
    }
    public void setHealer(Healer healer){
        this.healer = healer;
    }
    public void setMythicalCreature(MythicalCreature mythicalCreature){
        this.mythicalCreature = mythicalCreature;
    }
    public void Displayplayer(){
        System.out.println("XP level:"+ this.XP);
        System.out.println("Archer--"+ archer.getName());
        System.out.println("Knight-- "+knight.getName());
        System.out.println("Mage-- "+mage.getName());
        System.out.println("Healer-- "+healer.getName());
        System.out.println("mythical-- "+mythicalCreature.getName());
    }
    public void playerstatus (){
        System.out.println("Archer--- Attack= "+archer.attack + " Defence= "+archer.defence+" Health= "+archer.health);
        System.out.println("Knight--- Attack= "+knight.attack + " Defence= "+knight.defence+" Health= "+knight.health);
        System.out.println("Mage--- Attack= "+mage.attack + " Defence= "+mage.defence+" Health= "+mage.health);
        System.out.println("Healer--- Attack= "+healer.attack + " Defence= "+healer.defence+" Health= "+healer.health);
        System.out.println("Mythical Creature --- Attack= "+mythicalCreature.attack + " Defence= "+mythicalCreature.defence+" Health= "+mythicalCreature.health);
    }


    public Map<character,Integer> getArmy() {
        return Army;
    }

    public void setArmy(Map<character , Integer> army) {
        Army = army;
    }

    public String getUserName() {
        return userName;
    }

}
