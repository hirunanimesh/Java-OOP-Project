import java.util.*;

import Character.*;


public class Main {
    public static void Table(int n) {
        final String ANSI_BLACK_BACKGROUND = "\u001B[40m";  // Black background
        final String ANSI_YELLOW = "\u001B[33m"; // Yellow
        System.out.println(ANSI_BLACK_BACKGROUND);
        System.out.println(ANSI_YELLOW);

        if(n==1){
            printTableHeader();
            printTableRow("1).Chainmail", 70, "no change", "+1", "no change", "-1");
            printTableRow("2).Regalia", 105, "no change", "+1", "no change", "no change");
            printTableRow("3).Fleece", 150, "no change", "+2", "+1", "-1");
        }
        if(n==2){
            printTableHeader();
            printTableRow("1).Excalibur", 150, "+2", "no change", "no change", "no change");
            printTableRow("2).Amulet", 200, "+1", "-1", "+1", "+1");
            printTableRow("3).Crystal", 210, "+2", "+1", "-1", "-1");
        }
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RESET_B = "\u001B[0m";   // Reset to default color
        System.out.println(ANSI_RESET);
        System.out.println(ANSI_RESET_B);
    }

    private static void printTableHeader() {
        System.out.printf("%-15s %-10s %-10s %-10s %-10s %-10s\n", "Name", "Price", "Attack", "Defence", "Health", "Speed");
        printTableSeparator();
    }

    private static void printTableRow(String name, int price, String attack, String defence, String health, String speed) {
        System.out.printf("%-15s %-10d %-10s %-10s %-10s %-10s\n", name, price, attack, defence, health, speed);
    }

    private static void printTableSeparator() {
        System.out.println("--------------------------------------------------------------------");
    }
    public static void Entry(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ANSI escape code for green text
        final String ANSI_GREEN = "\u001B[32m";
        // ANSI reset code to reset text formatting
        final String ANSI_RESET = "\u001B[0m";

        String[] line1 = {
                "███╗░░░███╗██╗░░░██╗███████╗████████╗██╗ ██████╗",
                "████╗░████║╚██╗░██╔╝██╔════╝╚══██╔══╝██║██╔════╝",
                "██╔████╔██║░╚████╔╝░███████╗░░░██║░░░██║██║░░░  ",
                "██║╚██╔╝██║░░╚██╔╝░░╚════██║░░░██║░░░██║██║░░░  ",
                "██║░╚═╝░██║░░░██║░░░███████║░░░██║░░░██║╚██████╗",
                "╚═╝░░░░░╚═╝░░░╚═╝░░░╚══════╝░░░╚═╝░░░╚═╝ ╚═════╝"
        };

        String[] line2 = {
                "                      ███╗░░░███╗░█████╗░██╗░░░██╗██╗░░██╗███████╗███╗░░░███╗",
                "                      ████╗░████║██╔══██╗╚██╗░██╔╝██║░░██║██╔════╝████╗░████║",
                "                      ██╔████╔██║███████║░╚████╔╝░███████║█████╗░░██╔████╔██║",
                "                      ██║╚██╔╝██║██╔══██║░░╚██╔╝░░██╔══██║██╔══╝░░██║╚██╔╝██║",
                "                      ██║░╚═╝░██║██║░░██║░░░██║░░░██║░░██║███████╗██║░╚═╝░██║",
                "                      ╚═╝░░░░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░╚═╝░░╚═╝╚══════╝╚═╝░░░░░╚═╝"
        };

        // Prompt for user to press Enter
        System.out.println("Press 'Enter' to initiate launch sequence...");
        scanner.nextLine(); // Wait for the user to press Enter

        // Countdown before showing the title
        for (int i = 5; i > 0; i--) {
            System.out.print("\r" + "Launching in... " + i);
            try {
                Thread.sleep(1000); // 1 second pause between countdown numbers
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Interrupted during countdown");
            }
        }

        System.out.println("\n\n"); // Print new lines to simulate clearing the previous countdown



        // "Explode" the title into view
        for (String line : line1) {
            System.out.print(ANSI_GREEN);
            System.out.println(line);
            System.out.print(ANSI_RESET);

            // Pause between lines to enhance the "explosion" effect
            try {
                Thread.sleep(250); // Wait time in milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (String line : line2) {
            //System.out.print(ANSI_GREEN);
            System.out.println(line);
            //System.out.print(ANSI_RESET);

            // Pause between lines to enhance the "explosion" effect
            try {
                Thread.sleep(250); // Wait time in milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Wait(500);

    }
    public static void Wait(int n) {
        try {
            Thread.sleep(n); // Wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void print(String title){
        for (int i = 0; i < title.length(); i++) {
            System.out.print(title.charAt(i));



            try {
                Thread.sleep(50); // Wait for 100 milliseconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread was interrupted");
            }
        }
        System.out.println();
    }
    public static  int count = 0;
    public static void Battlegound(Player player1,Player player2){
        //player1 = challanger
        //player2  = under the attack

        String Battleground = player2.homeground;

        character[] arr1 = {player1.archer,player1.knight,player1.mage,player1.healer,player1.mythicalCreature};
        character[] arr2 = {player2.archer,player2.knight,player2.mage,player2.healer,player2.mythicalCreature};

        ArrayList<String> Highlanders = new ArrayList<>(Arrays.asList("Character.Shooter", "Character.Ranger","Character.Cavalier","Character.Zoro","Character.Enchanter","Character.Conjurer","Character.Medic"));
        ArrayList<String> Marshlanders = new ArrayList<>(Arrays.asList("Character.Squire", "Character.Swiftblade","Character.Warlock","Character.Alchemist","Character.Basilisk","Character.Hydra"));
        ArrayList<String> Sunchildren = new ArrayList<>(Arrays.asList("Character.Sunfire", "Character.Zing","Character.Templar","Character.Soother","Character.Lightbringer","Character.Dragon","Character.Phoenix"));
        ArrayList<String> Mystics = new ArrayList<>(Arrays.asList("Character.Saggitarius", "Character.Illusionist","Character.Eldritch","Character.Saint","Character.Pegasus"));
        if (Battleground.equals("Hilcrest")){
            for (character c1 : arr1){
                if (Highlanders.contains(c1.getClass().getName())){
                    c1.attack ++;
                    c1.defence++;
                }
            }
            for (character c2 : arr2){
                if (Highlanders.contains(c2.getClass().getName())){
                    c2.attack ++;
                    c2.defence++;
                }
            }

        }else if (Battleground.equals("Marshland")){

            for (character c1 : arr1){

                if (Marshlanders.contains(c1.getClass().getName())){
                    c1.defence+=2;
                }
                if (Sunchildren.contains(c1.getClass().getName())){
                    c1.attack-=1;
                }
                if (Mystics.contains(c1.getClass().getName())){
                    c1.speed-=1;
                }
            }
            for (character c2 : arr2){
                if (Marshlanders.contains(c2.getClass().getName())){
                    c2.defence+=2;
                }
                if (Sunchildren.contains(c2.getClass().getName())){
                    c2.attack--;
                }
                if (Mystics.contains(c2.getClass().getName())){
                    c2.speed--;
                }
            }
        }else if(Battleground.equals("Desert")){
            for (character c1 : arr1){
                if (Marshlanders.contains(c1.getClass().getName())){
                    c1.health--;
                }
                if (Sunchildren.contains(c1.getClass().getName())){
                    c1.attack++;
                }
            }
            for (character c2 : arr2){
                if (Marshlanders.contains(c2.getClass().getName())){
                    c2.health--;
                }
                if (Sunchildren.contains(c2.getClass().getName())){
                    c2.attack++;
                }
            }
        }else if (Battleground.equals("Arcane")){
            for (character c1 : arr1){
                if (Mystics.contains(c1.getClass().getName())){
                    c1.attack+=2;
                }
                if (Highlanders.contains(c1.getClass().getName())){
                    c1.speed --;
                    c1.defence--;
                }
                if (Marshlanders.contains(c1.getClass().getName())){
                    c1.speed --;
                    c1.defence--;
                }
            }
            for (character c2 : arr2){
                if (Mystics.contains(c2.getClass().getName())){
                    c2.attack+=2;
                }
                if (Highlanders.contains(c2.getClass().getName())){
                    c2.speed --;
                    c2.defence--;
                }
                if (Marshlanders.contains(c2.getClass().getName())){
                    c2.speed --;
                    c2.defence--;
                }
            }
        }

    }

    public static void Attack(Player player1,Player player2){
        int n =1;

        for (int i=1 ; i< 11 ;i++){
            character attacker = getattacker(player1);
            if (attacker.getName().equals("Soother") || attacker.getName().equals("Medic") || attacker.getName().equals("Alchemist") || attacker.getName().equals("Saint") || attacker.getName().equals("Lightbringer") ){
               character patient = getPatient(player1);
               patient.health += 0.1 * attacker.attack;
                System.out.print("#######################################");
                print("turn : "+ n +" attacker "+player1.getUserName());
                print(attacker.getName() +" heals "+patient.getName());
                System.out.printf("patient's new health = %.1f",patient.health);
                System.out.println();
                System.out.printf("Healer's health = %.1f" , patient.health);
                System.out.println();



            }else{
                character defender = getDefender(player2);
                defender.health = defender.health - (0.5 * attacker.attack)+(0.1 * defender.defence);
                if (defender.health <= 0){
                    player2.getArmy().remove(defender);
                    if(player2.getArmy().isEmpty()){
                        print(player1.getUserName()+" Won");
                        int newGold = (int)(player1.goldCoins + player2.goldCoins*0.1);
                        player1.goldCoins = newGold;
                        player1.XP +=1;


                        return ;
                    }
                }
                System.out.println("#######################################");
                print("turn : "+ n +" attacker "+player1.getUserName());
                //System.out.println( player1.userName + " attacks "+ player2.userName);
                print(attacker.getName()+" attacks "+ defender.getName());
                if (defender.health <= 0){
                    print(defender.getName() +" is dead!");
                    System.out.println();
                }else{
                    System.out.printf(defender.getName()+"'s health= %.1f",defender.health);
                    System.out.println();

                }
                System.out.printf(attacker.getName()+"'s health = %.1f",attacker.health);
                System.out.println();
                System.out.println();

            }


            attacker = getattacker(player2);
            n++;
            if (attacker.getName().equals("Soother") || attacker.getName().equals("Medic") || attacker.getName().equals("Alchemist") || attacker.getName().equals("Saint") || attacker.getName().equals("Lightbringer") ){
                character patient = getPatient(player2);
                patient.health += 0.1 * attacker.attack;
                //System.out.println("#######################################");
                print("turn : "+ n +" attacker "+player2.getUserName());
                print(attacker.getName() +" heals "+patient.getName());
                System.out.printf("patient's new health = %.1f",patient.health);
                System.out.println();
                System.out.printf("Healer's health = %.1f" , attacker.health);
                System.out.println();

            }else {
                character defender = getDefender(player1);
                defender = getDefender(player1);
                defender.health = defender.health - (0.5 * attacker.attack)+(0.1 * defender.defence);
                if (defender.health <= 0){
                    player1.getArmy().remove(defender);
                    if(player1.getArmy().isEmpty()){
                        System.out.println(player2.getUserName()+" won!!!");
                        int newGold = (int)(player2.goldCoins + player1.goldCoins*0.1);
                        player2.goldCoins = newGold;
                        player2.XP +=1;
                        return;
                    }
                }

                print("turn "+ n +" "+player2.getUserName() );
                //System.out.println(attacker.getName()+" attacks "+ defender.getName());
                print(attacker.getName()+" attacks "+ defender.getName());
                if (defender.health<=0){
                    print(defender.getName()+" is dead!");
                    System.out.println();
                }else{
                    System.out.printf(defender.getName()+"'s health= %.1f",defender.health);
                    System.out.println();
                }
                System.out.printf(attacker.getName()+"'s health = %.1f",attacker.health);
                System.out.println();
                System.out.println();
            }
            n++;


        }
        print("Match draw");



    }
    public static character getDefender(Player player){
        Map<character,Integer> Army = player.getArmy();
        character defender = new Dragon(0,20000,56,46,34);

        for (Map.Entry<character, Integer> entry : Army.entrySet()) {

            //System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            if (entry.getKey().defence<defender.defence){
                defender = entry.getKey();
            }
        }
        return defender;


    }
    public static character getPatient(Player player){
        Map<character,Integer> Army = player.getArmy();
        character patient = new Dragon(0,20000,560000,46,34);

        for (Map.Entry<character, Integer> entry : Army.entrySet()) {

            //System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            if (entry.getKey().health<patient.health){
                patient = entry.getKey();
            }
        }
        return patient;
    }
    public static Player getEnemy(ArrayList<String> UserNames){
        Player whitewolf = new Player("GeraltofRivia","whitewolf",32,215);
        UserNames.add(whitewolf.getUserName());
        whitewolf.setHomeground("Marshland");
        whitewolf.archer = new Ranger(14,5,8,10,115);
        whitewolf.archer.setSupName("Archer");
        whitewolf.archer.setName("Ranger");
        whitewolf.knight = new Squire(8,9,7,8,85);
        whitewolf.knight.setName("Squire");
        whitewolf.knight.setSupName("Knight");
        whitewolf.mage = new Warlock(12,7,10,12,100);
        whitewolf.mage.setName("Warlock");
        whitewolf.mage.setSupName("Mage");
        whitewolf.healer = new Medic(12,9,10,7,125);
        whitewolf.healer.setName("Medic");
        whitewolf.healer.setSupName("Healer");
        whitewolf.mythicalCreature = new Dragon(12,14,15,8,120);
        whitewolf.mythicalCreature.setName("Dragon");
        whitewolf.mythicalCreature.setSupName("MythicalCreature");
        /// since whitewolf have chain mail
        whitewolf.archer.speed-=1;
        whitewolf.archer.defence+=1;
        // since whitewolf have amulet
        whitewolf.healer.attack+=1;
        whitewolf.healer.defence-=1;
        whitewolf.healer.speed+=1;
        whitewolf.healer.health+=1;

        Map<character, Integer> map = new LinkedHashMap<>();
        map.put(whitewolf.archer, whitewolf.archer.speed);
        map.put(whitewolf.knight, whitewolf.knight.speed);
        map.put(whitewolf.mage, whitewolf.mage.speed);
        map.put(whitewolf.healer, whitewolf.healer.speed);
        map.put(whitewolf.mythicalCreature, whitewolf.mythicalCreature.speed);

        Map<character , Integer> speedmap =  sortByValueDescending(map);
        whitewolf.setArmy(speedmap);


        return whitewolf;
    }
    public static Player getNextEnemy(ArrayList<String> UserNames){
        Player Maria = new Player("Carnefice","Maria",40,122);
        UserNames.add(Maria.getUserName());
        Maria.setHomeground("Desert");
        Maria.archer = new Shooter(11,4,6,9,80);
        Maria.archer.setSupName("Archer");
        Maria.archer.setName("Shooter");
        Maria.knight = new Cavalier(10,12,7,10,110);
        Maria.knight.setName("Cavalier");
        Maria.knight.setSupName("Knight");
        Maria.mage = new Warlock(12,7,10,12,100);
        Maria.mage.setName("Warlock");
        Maria.mage.setSupName("Mage");
        Maria.healer = new Medic(12,9,10,7,125);
        Maria.healer.setName("Medic");
        Maria.healer.setSupName("Healer");
        Maria.mythicalCreature = new Dragon(12,14,15,8,120);
        Maria.mythicalCreature.setName("Dragon");
        Maria.mythicalCreature.setSupName("MythicalCreature");



        Map<character, Integer> map = new LinkedHashMap<>();
        map.put(Maria.archer, Maria.archer.speed);
        map.put(Maria.knight, Maria.knight.speed);
        map.put(Maria.mage, Maria.mage.speed);
        map.put(Maria.healer, Maria.healer.speed);
        map.put(Maria.mythicalCreature, Maria.mythicalCreature.speed);

        Map<character , Integer> speedmap =  sortByValueDescending(map);
        Maria.setArmy(speedmap);


        return Maria;
    }
    //public static Player getNextEnemy(ArrayList<String> UserNames){}
    public static <K, V> Map.Entry<K, V> getLastEntry(Map<K, V> map) {
        if (map.isEmpty()) {
            return null;
        }

        // Iterate over the map and find the last entry
        Map.Entry<K, V> lastEntry = null;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            lastEntry = entry;
        }
        return lastEntry;
    }
   public static character getattacker(Player player){
        //Map<character , Integer> Army = player.getArmy();
        Map.Entry<character, Integer> lastEntry = getLastEntry(player.getArmy());

       for (Map.Entry<character, Integer> entry : player.getArmy().entrySet()) {
           //System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());


           int r = entry.getKey().getR();

           if (player.round != r && lastEntry.getKey() == entry.getKey() ){
               player.round++;
               entry.getKey().setR(++r);

               return entry.getKey();
           }
           if (lastEntry.getKey() == entry.getKey()){
               player.round++;
           }
           if(player.round != r){
               entry.getKey().setR(++r);
               //System.out.println(entry.getKey().getR());
               return entry.getKey();
           }

       }
       return null;
    }


   public static   void Buy(Player player) {

       Scanner in = new Scanner(System.in);
       print("what do you want to buy:\n1).Archer\n2).Knight\n3).Mage\n4).Healer\n5).Mythical Creature");
       int choice1 = in.nextInt();
       if (choice1 == 1) {
           if(player.archer == null) {
               final String ANSI_BLACK_BACKGROUND = "\u001B[40m";  // Black background
               final String ANSI_YELLOW = "\u001B[33m"; // Yellow
               System.out.println(ANSI_BLACK_BACKGROUND);
               System.out.println(ANSI_YELLOW);

               System.out.format("+---------------+-------+--------+--------+--------+-------+%n");
               System.out.format("|     Name      | Price | Attack | Defence| Health | Speed |%n");
               System.out.format("+---------------+-------+--------+--------+--------+-------+%n");
               System.out.format("+---------------+-------+--------+--------+--------+-------+%n");
               System.out.format("| 1).Shooter    | 80 gc | 11     | 4      | 6      | 9     |%n");
               System.out.format("| 2).Ranger     | 115 gc| 14     | 5      | 8      | 10    |%n");
               System.out.format("| 3).Sunfire    | 160 gc| 15     | 5      | 7      | 14    |%n");
               System.out.format("| 4).Zing       | 200 gc| 16     | 9      | 11     | 14    |%n");
               System.out.format("| 5).Saggitarius| 230 gc| 18     | 7      | 12     | 17    |%n");
               System.out.format("+---------------+-------+--------+--------+--------+-------+%n");
               final String ANSI_RESET = "\u001B[0m";
               final String ANSI_RESET_B = "\u001B[0m";   // Reset to default color
               System.out.println(ANSI_RESET);
               System.out.println(ANSI_RESET_B);
               int choice2 = in.nextInt();
               if (choice2 == 1 && player.goldCoins >= 80) {
                   Shooter shooter = new Shooter(11, 4, 6, 9, 80);
                   shooter.setName("Shooter");
                   player.setArcher(shooter);
                   player.goldCoins -= player.archer.price;
                   count++;
               } else if (choice2 == 2 && player.goldCoins>=115) {
                   Ranger ranger = new Ranger(14, 5, 8, 10, 115);
                   ranger.setName("Ranger");
                   player.setArcher(ranger);
                   player.goldCoins -= player.archer.price;
                   count++;
               } else if (choice2 == 3 && player.goldCoins>= 160) {
                   Sunfire sunfire = new Sunfire(15, 5, 7, 14, 160);
                   sunfire.setName("Sunfire");
                   player.setArcher(sunfire);
                   player.goldCoins -= player.archer.price;
                   count++;
               } else if (choice2 == 4 && player.goldCoins >= 200) {
                   Zing zing = new Zing(16, 9, 11, 14, 200);
                   zing.setName("Zing");
                   player.setArcher(zing);
                   player.goldCoins -= player.archer.price;
                   count++;
               } else if (choice2 == 5 && player.goldCoins>= 230) {
                   Saggitarius saggitarius = new Saggitarius(18, 7, 12, 17, 230);
                   saggitarius.setName("Saggitarius");
                   player.setArcher(saggitarius);
                   player.goldCoins -= player.archer.price;
                   count++;
               }else{
                   print("You do not have enough gold coins to buy this character!!");
                   Wait(500);
               }

           }else{
               System.out.println("You have already bought an archer, Do you like to sell him \n1).Yes\n2).No");
               int choice = in.nextInt();
               if (choice == 1){
                   player.goldCoins += Math.round(player.archer.price* 0.9);
                   player.archer = null;
                   count--;
               }


           }
       } else if (choice1 == 2) {
           if (player.knight == null) {
               final String ANSI_BLACK_BACKGROUND = "\u001B[40m";  // Black background
               final String ANSI_YELLOW = "\u001B[33m"; // Yellow
               System.out.println(ANSI_BLACK_BACKGROUND);
               System.out.println(ANSI_YELLOW);

               System.out.format("+---------------+-------+--------+--------+--------+-------+%n");
               System.out.format("|     Name      | Price | Attack | Defence| Health | Speed |%n");
               System.out.format("+---------------+-------+--------+--------+--------+-------+%n");
               System.out.format("+---------------+-------+--------+--------+--------+-------+%n");
               System.out.format("| 1).Squire     | 85 gc |  8     |  9     |  7     |  8    |%n");
               System.out.format("| 2).Cavalier   | 110 gc| 10     | 12     |  7     | 10    |%n");
               System.out.format("| 3).Templar    | 155 gc| 14     | 16     | 12     | 12    |%n");
               System.out.format("| 4).Zoro       | 180 gc| 17     | 16     | 13     | 14    |%n");
               System.out.format("| 5).Swiftblade | 250 gc| 18     | 20     | 17     | 13    |%n");
               System.out.format("+---------------+-------+--------+--------+--------+-------+%n");
               final String ANSI_RESET = "\u001B[0m";
               final String ANSI_RESET_B = "\u001B[0m";   // Reset to default color
               System.out.println(ANSI_RESET);
               System.out.println(ANSI_RESET_B);
               int choice2 = in.nextInt();
               if (choice2 == 1 && player.goldCoins >= 85) {
                   Squire squire = new Squire(8, 9, 7, 8, 85);
                   squire.setName("Squire");
                   player.setKnight(squire);
                   player.goldCoins -= player.knight.price;
                   count++;
               } else if (choice2 == 2 && player.goldCoins >= 110) {
                   Cavalier cavalier = new Cavalier(10, 12, 7, 10, 110);
                   cavalier.setName("Cavalier");
                   player.setKnight(cavalier);
                   player.goldCoins -= player.knight.price;
                   count++;
               } else if (choice2 == 3 && player.goldCoins>= 155) {
                   Templar templar = new Templar(14, 16, 12, 12, 155);
                   templar.setName("Templar");
                   player.setKnight(templar);
                   player.goldCoins -= player.knight.price;
                   count++;
               } else if (choice2 == 4 && player.goldCoins >= 180) {
                   Zoro zoro = new Zoro(17, 16, 13, 14, 180);
                   zoro.setName("Zoro");
                   player.setKnight(zoro);
                   player.goldCoins -= player.knight.price;
                   count++;
               } else if (choice2 == 5 && player.goldCoins>= 250) {
                   Swiftblade swiftblade = new Swiftblade(18, 20, 17, 13, 250);
                   swiftblade.setName("Swiftblade");
                   player.setKnight(swiftblade);
                   player.goldCoins -= player.knight.price;
                   count++;


               }else{
                   print("You do not have enough gold coins to buy this character!!");

               }

           }else{
               print("You have already bought an knight, Do you like to sell him \n1).Yes\n2).No");
               int choice = in.nextInt();
               if (choice == 1){
                   player.goldCoins += Math.round(player.knight.price* 0.9);
                   player.knight = null;
                   count--;
               }

           }
       }else if (choice1==3){
           if (player.mage == null) {
               final String ANSI_BLACK_BACKGROUND = "\u001B[40m";  // Black background
               final String ANSI_YELLOW = "\u001B[33m"; // Yellow
               System.out.println(ANSI_BLACK_BACKGROUND);
               System.out.println(ANSI_YELLOW);

               System.out.format("+---------------+-------+--------+--------+--------+-------+%n");
               System.out.format("|     Name      | Price | Attack | Defence| Health | Speed |%n");
               System.out.format("+---------------+-------+--------+--------+--------+-------+%n");
               System.out.format("+---------------+-------+--------+--------+--------+-------+%n");
               System.out.format("| 1).Warlock    | 100 gc| 12     |  7     | 10     | 12    |%n");
               System.out.format("| 2).Illusionist| 120 gc| 13     |  8     | 12     | 14    |%n");
               System.out.format("| 3).Enchanter  | 160 gc| 16     | 10     | 13     | 16    |%n");
               System.out.format("| 4).Conjurer   | 195 gc| 18     | 15     | 14     | 12    |%n");
               System.out.format("| 5).Eldritch   | 270 gc| 19     | 17     | 18     | 14    |%n");
               System.out.format("+---------------+-------+--------+--------+--------+-------+%n");
               final String ANSI_RESET = "\u001B[0m";
               final String ANSI_RESET_B = "\u001B[0m";   // Reset to default color
               System.out.println(ANSI_RESET);
               System.out.println(ANSI_RESET_B);
               int choice2 = in.nextInt();
               if (choice2 == 1 && player.goldCoins>= 100) {
                   Warlock warlock = new Warlock(12, 7, 10, 12, 100);
                   warlock.setName("Warlock");
                   player.setMage(warlock);
                   player.goldCoins -= player.mage.price;
                   count++;
               } else if (choice2 == 2 && player.goldCoins >= 120) {
                   Illusionist illusionist = new Illusionist(13, 8, 12, 14, 120);
                   illusionist.setName("Illusionist");
                   player.setMage(illusionist);
                   player.goldCoins -= player.mage.price;
                   count++;
               } else if (choice2 == 3 && player.goldCoins >=160) {
                   Enchanter enchanter = new Enchanter(16, 10, 13, 16, 160);
                   enchanter.setName("Enchanter");
                   player.setMage(enchanter);
                   player.goldCoins -= player.mage.price;
                   count++;
               } else if (choice2 == 4 && player.goldCoins>= 195) {
                   Conjurer conjurer = new Conjurer(18, 15, 14, 12, 195);
                   conjurer.setName("Conjurer");
                   player.setMage(conjurer);
                   player.goldCoins -= player.mage.price;
                   count++;
               } else if (choice2 == 5 && player.goldCoins>=270) {
                   Eldritch eldritch = new Eldritch(19, 17, 18, 14, 270);
                   eldritch.setName("Eldritch");
                   player.setMage(eldritch);
                   player.goldCoins -= player.mage.price;
                   count++;
               }else{
                   print("You do not have enough gold coins to buy this character!!");
               }
           }else{
               print("You have already bought an Mage, Do you like to sell him \n1).Yes\n2).No");
               int choice = in.nextInt();
               if (choice == 1){
                   player.goldCoins += Math.round(player.mage.price* 0.9);
                   player.mage = null;
                   count--;
               }

           }
       }else if(choice1 == 4 ){
           if(player.healer == null) {
               final String ANSI_BLACK_BACKGROUND = "\u001B[40m";  // Black background
               final String ANSI_YELLOW = "\u001B[33m"; // Yellow
               System.out.println(ANSI_BLACK_BACKGROUND);
               System.out.println(ANSI_YELLOW);

               System.out.format("+----------------+-------+--------+--------+--------+-------+%n");
               System.out.format("|     Name       | Price | Attack | Defence| Health | Speed |%n");
               System.out.format("+----------------+-------+--------+--------+--------+-------+%n");
               System.out.format("+----------------+-------+--------+--------+--------+-------+%n");
               System.out.format("| 1).Soother     |  95 gc| 10     |  8     |  9     |  6    |%n");
               System.out.format("| 2).Medic       | 125 gc| 12     |  9     | 10     |  7    |%n");
               System.out.format("| 3).Alchemist   | 150 gc| 13     | 13     | 13     | 13    |%n");
               System.out.format("| 4).Saint       | 200 gc| 16     | 14     | 17     |  9    |%n");
               System.out.format("| 5).Lightbringer| 260 gc| 17     | 15     | 19     | 12    |%n");
               System.out.format("+----------------+-------+--------+--------+--------+-------+%n");
               final String ANSI_RESET = "\u001B[0m";
               final String ANSI_RESET_B = "\u001B[0m";   // Reset to default color
               System.out.println(ANSI_RESET);
               System.out.println(ANSI_RESET_B);
               int choice2 = in.nextInt();
               if (choice2 == 1 && player.goldCoins >= 95) {
                   Soother soother = new Soother(10, 8, 9, 6, 95);
                   soother.setName("Soother");
                   player.setHealer(soother);
                   player.goldCoins -= player.healer.price;
                   count++;
               } else if (choice2 == 2 && player.goldCoins >= 125) {
                   Medic medic = new Medic(12, 9, 10, 7, 125);
                   medic.setName("Medic");
                   player.setHealer(medic);
                   player.goldCoins -= player.healer.price;
                   count++;
               } else if (choice2 == 3 && player.goldCoins>= 150) {
                   Alchemist alchemist = new Alchemist(13, 13, 13, 13, 150);
                   alchemist.setName("Alchemist");
                   player.setHealer(alchemist);
                   player.goldCoins -= player.healer.price;
                   count++;
               } else if (choice2 == 4 && player.goldCoins>=200) {
                   Saint saint = new Saint(16, 14, 17, 9, 200);
                   saint.setName("Saint");
                   player.setHealer(saint);
                   player.goldCoins -= player.healer.price;
                   count++;
               } else if (choice2 == 5 && player.goldCoins >= 260) {
                   Lightbringer lightbringer = new Lightbringer(17, 15, 19, 12, 260);
                   lightbringer.setName("Lightbringer");
                   player.setHealer(lightbringer);
                   player.goldCoins -= player.healer.price;
                   count++;
               }else{
                   print("You do not have enough gold coins to buy this character!!");
               }

           }else{
               print("You have already bought an Healer, Do you like to sell him \n1).Yes\n2).No");
               int choice = in.nextInt();
               if (choice == 1){
                   player.goldCoins += Math.round(player.healer.price* 0.9);
                   player.healer = null;
                   count--;
               }
           }
       }else if(choice1 == 5){
           if (player.mythicalCreature == null) {
               final String ANSI_BLACK_BACKGROUND = "\u001B[40m";  // Black background
               final String ANSI_YELLOW = "\u001B[33m"; // Yellow
               System.out.println(ANSI_BLACK_BACKGROUND);
               System.out.println(ANSI_YELLOW);

               System.out.format("+----------------+-------+--------+--------+--------+-------+%n");
               System.out.format("|     Name       | Price | Attack | Defence| Health | Speed |%n");
               System.out.format("+----------------+-------+--------+--------+--------+-------+%n");
               System.out.format("+----------------+-------+--------+--------+--------+-------+%n");
               System.out.format("| 1).Dragon      | 120 gc| 12     | 14     |  15    |  8    |%n");
               System.out.format("| 2).Basilisk    | 165 gc| 15     | 11     |  10    | 12    |%n");
               System.out.format("| 3).Hydra       | 205 gc| 12     | 16     |  15    | 11    |%n");
               System.out.format("| 4).Phoenix     | 275 gc| 17     | 13     |  17    | 19    |%n");
               System.out.format("| 5).Pegasus     | 340 gc| 14     | 18     |  20    | 20    |%n");
               System.out.format("+----------------+-------+--------+--------+--------+-------+%n");
               final String ANSI_RESET = "\u001B[0m";
               final String ANSI_RESET_B = "\u001B[0m";   // Reset to default color
               System.out.println(ANSI_RESET);
               System.out.println(ANSI_RESET_B);
               int choice2 = in.nextInt();
               if (choice2 == 1 && player.goldCoins>= 120) {
                   Dragon dragon = new Dragon(12, 14, 15, 8, 120);
                   dragon.setName("Dragon");
                   player.setMythicalCreature(dragon);
                   player.goldCoins -= player.mythicalCreature.price;
                   count++;
               } else if (choice2 == 2 && player.goldCoins>= 165) {
                   Basilisk basilisk = new Basilisk(15, 11, 10, 12, 165);
                   basilisk.setName("Basilisk");
                   player.setMythicalCreature(basilisk);
                   player.goldCoins -= player.mythicalCreature.price;
                   count++;
               } else if (choice2 == 3 && player.goldCoins>=205) {
                   Hydra hydra = new Hydra(12, 16, 15, 11, 205);
                   hydra.setName("Hydra");
                   player.setMythicalCreature(hydra);
                   player.goldCoins -= player.mythicalCreature.price;
                   count++;
               } else if (choice2 == 4 && player.goldCoins>=275) {
                   Phoenix phoenix = new Phoenix(17, 13, 17, 19, 275);
                   phoenix.setName("Phoenix");
                   player.setMythicalCreature(phoenix);
                   player.goldCoins -= player.mythicalCreature.price;
                   count++;
               } else if (choice2 == 5 && player.goldCoins>= 340) {
                   Pegasus pegasus = new Pegasus(14, 18, 20, 20, 340);
                   pegasus.setName("Pegasus");
                   player.setMythicalCreature(pegasus);
                   player.goldCoins -= player.mythicalCreature.price;
                   count++;
               }else{
                   print("You do not have enough gold coins to buy this character!!");
               }

           }else{
               print("You have already bought an mythical creature, Do you like to sell him \n1).Yes\n2).No");
               int choice = in.nextInt();
               if (choice == 1){
                   player.goldCoins += Math.round(player.mythicalCreature.price* 0.9);
                   player.mythicalCreature = null;
                   count--;
               }
           }

       }

   }
    public static Map<character, Integer> sortByValueDescending(Map<character, Integer> map) {
        // Create a list of map entries
        List<Map.Entry<character, Integer>> entryList = new ArrayList<>(map.entrySet());

        // Sort the list by values in descending order
        Collections.sort(entryList, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // Construct a new LinkedHashMap with sorted entries
        Map<character, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<character, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
    public static boolean flag=true;
    public static void  buyEquipments (Player player) {
        Scanner In = new Scanner(System.in);
        print("Do you want to buy Equipments:\n1).Yes\n2).No");
        int choice = In.nextInt();
        if (choice == 2) {
            flag = false;
            return;
        }
        print("To whom do you want to apply the equipment\n1).Archer\n2).Knight\n3).Mage\n4).Healer\n5).Mythical Creature");
        int choice1 = In.nextInt();
        if (choice1 == 1) {
            print("Which equipment do you want to apply?\n1).Armour\n2).Artefact");
            int choice2 = In.nextInt();
            if (choice2 == 1) {
                print("your gold coins :"+player.goldCoins);
                //System.out.println("Which armour do you want to apply?\n1).Chainmail : cost=70\n2).Regalia : cost= 105\n3).Fleece : cost= 150");
                Table(1);
                int choice3 = In.nextInt();
                if (choice3 == 1) {
                    Armour chainmail = new Armour(70, 0, 1, 0, -1);
                    if (player.goldCoins >= chainmail.getPrice()) {
                        player.archer.attack += chainmail.getAttack();
                        player.archer.defence += chainmail.getDefence();
                        player.archer.health += chainmail.getHealth();
                        player.archer.speed += chainmail.getSpeed();
                        player.goldCoins -= chainmail.getPrice();
                        player.archer.price += chainmail.getPrice()*0.2;
                        return ;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                        return;
                    }

                } else if (choice3 == 2) {
                    Armour Regalia = new Armour(105, 0, 1, 0, 0);
                    if (player.goldCoins >= Regalia.getPrice()) {
                        player.archer.attack += Regalia.getAttack();
                        player.archer.defence += Regalia.getDefence();
                        player.archer.health += Regalia.getHealth();
                        player.archer.speed += Regalia.getSpeed();
                        player.goldCoins -= Regalia.getPrice();
                        player.archer.price += Regalia.getPrice()*0.2;

                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                } else if (choice3 == 3) {
                    Armour fleece = new Armour(150, 0, 2, 1, -1);
                    if (player.goldCoins >= fleece.getPrice()) {
                        player.archer.attack += fleece.getAttack();
                        player.archer.defence += fleece.getDefence();
                        player.archer.health += fleece.getHealth();
                        player.archer.speed += fleece.getSpeed();
                        player.goldCoins -= fleece.getPrice();
                        player.archer.price += fleece.getPrice()*0.2;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                }

            } else if (choice2 == 2) {
                print("Your gold points: "+player.goldCoins);
                //System.out.println("Which artefact do you want to apply?\n1).Excalibur : cost=150\n2).Amulet : cost=200 \n3).crystal : cost=210");
                Table(2);
                int choice3 = In.nextInt();
                if (choice3 == 1) {
                    Artefact Excalibur = new Artefact(150, 2, 0, 0, 0);
                    if (player.goldCoins >= Excalibur.getPrice()) {
                        player.archer.attack += Excalibur.getAttack();
                        player.archer.defence += Excalibur.getDefence();
                        player.archer.health += Excalibur.getHealth();
                        player.archer.speed += Excalibur.getSpeed();
                        player.goldCoins -= Excalibur.getPrice();
                        player.archer.price += Excalibur.getPrice()*0.2;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                } else if (choice3 == 2) {
                    Artefact amulet = new Artefact(200, 1, -1, +1, +1);
                    if (player.goldCoins >= amulet.getPrice()) {
                        player.archer.attack += amulet.getAttack();
                        player.archer.defence += amulet.getDefence();
                        player.archer.health += amulet.getHealth();
                        player.archer.speed += amulet.getSpeed();
                        player.goldCoins -= amulet.getPrice();
                        player.archer.price += amulet.getPrice()*0.2;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                } else if (choice3 == 3) {
                    Artefact crystal = new Artefact(210 ,2,1,-1,-1);
                    if (player.goldCoins >= crystal.getPrice()) {
                        player.archer.attack += crystal.getAttack();
                        player.archer.defence += crystal.getDefence();
                        player.archer.health += crystal.getHealth();
                        player.archer.speed += crystal.getSpeed();
                        player.goldCoins -= crystal.getPrice();
                        player.archer.price += crystal.getPrice()*0.2;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                }


            }
        } else if (choice1 == 2 ) {
            print("which Equipment do you want to apply?\n1).Armour\n2).Artefact");
            int choice2 = In.nextInt();
            if (choice2 == 1) {
                print("your gold coins :"+player.goldCoins);
                //System.out.println("Which armour do you want to apply?\n1).Chainmail : cost=70\n2).Regalia : cost= 105\n3).Fleece : cost= 150");
                Table(1);
                int choice3 = In.nextInt();
                if (choice3 == 1) {
                    Armour chainmail = new Armour(70, 0, 1, 0, -1);
                    if (player.goldCoins >= chainmail.getPrice()) {
                        player.knight.attack += chainmail.getAttack();
                        player.knight.defence += chainmail.getDefence();
                        player.knight.health += chainmail.getHealth();
                        player.knight.speed += chainmail.getSpeed();
                        player.goldCoins -= chainmail.getPrice();
                        player.knight.price += chainmail.getPrice()*0.2;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                } else if (choice3 == 2) {
                    Armour Regalia = new Armour(105, 0, 1, 0, 0);
                    if (player.goldCoins >= Regalia.getPrice()) {
                        player.knight.attack += Regalia.getAttack();
                        player.knight.defence += Regalia.getDefence();
                        player.knight.health += Regalia.getHealth();
                        player.knight.speed += Regalia.getSpeed();
                        player.goldCoins -= Regalia.getPrice();
                        player.knight.price += Regalia.getPrice()*0.2;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                } else if (choice3 == 3) {
                    Armour fleece = new Armour(150, 0, 2, 1, -1);
                    if (player.goldCoins >= fleece.getPrice()) {
                        player.knight.attack += fleece.getAttack();
                        player.knight.defence += fleece.getDefence();
                        player.knight.health += fleece.getHealth();
                        player.knight.speed += fleece.getSpeed();
                        player.goldCoins -= fleece.getPrice();
                        player.knight.price += fleece.getPrice()*0.2;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                }

            } else if (choice2 == 2) {
                print("Your gold points: "+player.goldCoins);
                //System.out.println("Which artefact do you want to apply?\n1).Excalibur : cost=150\n2).Amulet : cost=200 +\n3).crystal : cost=210");
                Table(2);
                int choice3 = In.nextInt();
                if (choice3 == 1) {
                    Artefact Excalibur = new Artefact(150, 2, 0, 0, 0);
                    if (player.goldCoins >= Excalibur.getPrice()) {
                        player.knight.attack += Excalibur.getAttack();
                        player.knight.defence += Excalibur.getDefence();
                        player.knight.health += Excalibur.getHealth();
                        player.knight.speed += Excalibur.getSpeed();
                        player.goldCoins -= Excalibur.getPrice();
                        player.knight.price += Excalibur.getPrice()*0.2;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                } else if (choice3 == 2) {
                    Artefact amulet = new Artefact(200, 1, -1, +1, +1);
                    if (player.goldCoins >= amulet.getPrice()) {
                        player.knight.attack += amulet.getAttack();
                        player.knight.defence += amulet.getDefence();
                        player.knight.health += amulet.getHealth();
                        player.knight.speed += amulet.getSpeed();
                        player.goldCoins -= amulet.getPrice();
                        player.knight.price += amulet.getPrice()*0.2;
                    }
                    else{
                        System.out.println("You don't have enough gold coins to buy this equipment");
                    }

                } else if (choice3 == 3) {
                    Artefact crystal = new Artefact(210,2,1,-1,-1);
                    if (player.goldCoins >= crystal.getPrice()) {
                        player.knight.attack += crystal.getAttack();
                        player.knight.defence += crystal.getDefence();
                        player.knight.health += crystal.getHealth();
                        player.knight.speed += crystal.getSpeed();
                        player.goldCoins -= crystal.getPrice();
                        player.knight.price += crystal.getPrice()*0.2;
                    }
                    else{
                        System.out.println("You don't have enough gold coins to buy this equipment");
                    }

                }


            }

        } else if (choice1 == 3) {
            print("which Equipment do you want to apply?\n1).Armour\n2).Artefact");
            int choice2 = In.nextInt();
            if (choice2 == 1) {
                print("your gold coins :"+player.goldCoins);
                //System.out.println("Which armour do you want to apply?\n1).Chainmail : cost=70\n2).Regalia : cost= 105\n3).Fleece : cost= 150");
                Table(1);
                int choice3 = In.nextInt();
                if (choice3 == 1) {
                    Armour chainmail = new Armour(70, 0, 1, 0, -1);
                    if (player.goldCoins >= chainmail.getPrice()) {
                        player.mage.attack += chainmail.getAttack();
                        player.mage.defence += chainmail.getDefence();
                        player.mage.health += chainmail.getHealth();
                        player.mage.speed += chainmail.getSpeed();
                        player.goldCoins -= chainmail.getPrice();
                        player.mage.price += chainmail.getPrice()*0.2;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                } else if (choice3 == 2) {
                    Armour Regalia = new Armour(105, 0, 1, 0, 0);
                    if (player.goldCoins >= Regalia.getPrice()) {
                        player.mage.attack += Regalia.getAttack();
                        player.mage.defence += Regalia.getDefence();
                        player.mage.health += Regalia.getHealth();
                        player.mage.speed += Regalia.getSpeed();
                        player.goldCoins -= Regalia.getPrice();
                        player.mage.price += Regalia.getPrice()*0.2;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                } else if (choice3 == 3) {
                    Armour fleece = new Armour(150, 0, 2, 1, -1);
                    if (player.goldCoins >= fleece.getPrice()) {
                        player.mage.attack += fleece.getAttack();
                        player.mage.defence += fleece.getDefence();
                        player.mage.health += fleece.getHealth();
                        player.mage.speed += fleece.getSpeed();
                        player.goldCoins -= fleece.getPrice();
                        player.mage.price += fleece.getPrice()*0.2;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                }

            } else if (choice2 == 2) {
                print("Your gold points: "+player.goldCoins);
                //System.out.println("Which artefact do you want to apply?\n1).Excalibur : cost=150\n2).Amulet : cost=200 +\n3).crystal : cost=210");
                Table(2);
                int choice3 = In.nextInt();
                if (choice3 == 1) {
                    Artefact Excalibur = new Artefact(150, 2, 0, 0, 0);
                    if (player.goldCoins >= Excalibur.getPrice()) {
                        player.mage.attack += Excalibur.getAttack();
                        player.mage.defence += Excalibur.getDefence();
                        player.mage.health += Excalibur.getHealth();
                        player.mage.speed += Excalibur.getSpeed();
                        player.goldCoins -= Excalibur.getPrice();
                        player.mage.price += Excalibur.getPrice()*0.2;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                } else if (choice3 == 2) {
                    Artefact amulet = new Artefact(200, 1, -1, +1, +1);
                    if (player.goldCoins >= amulet.getPrice()) {
                        player.mage.attack += amulet.getAttack();
                        player.mage.defence += amulet.getDefence();
                        player.mage.health += amulet.getHealth();
                        player.mage.speed += amulet.getSpeed();
                        player.goldCoins -= amulet.getPrice();
                        player.mage.price += amulet.getPrice()*0.2;
                    }
                    else{
                        System.out.println("You don't have enough gold coins to buy this equipment");
                    }

                } else if (choice3 == 3) {
                    Artefact crystal = new Artefact(210,2,1,-1,-1);
                    if (player.goldCoins >= crystal.getPrice()) {
                        player.mage.attack += crystal.getAttack();
                        player.mage.defence += crystal.getDefence();
                        player.mage.health += crystal.getHealth();
                        player.mage.speed += crystal.getSpeed();
                        player.goldCoins -= crystal.getPrice();
                        player.mage.price += crystal.getPrice()*0.2;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                }


            }


        } else if (choice1 == 4) {
            print("which Equipment do you want to apply?\n1).Armour\n2).Artefact");
            int choice2 = In.nextInt();
            if (choice2 == 1) {
                print("your gold coins :"+player.goldCoins);
                //System.out.println("Which armour do you want to apply?\n1).Chainmail : cost=70\n2).Regalia : cost= 105\n3).Fleece : cost= 150");
                Table(1);
                int choice3 = In.nextInt();
                if (choice3 == 1) {
                    Armour chainmail = new Armour(70, 0, 1, 0, -1);
                    if (player.goldCoins >= chainmail.getPrice()) {
                        player.healer.attack += chainmail.getAttack();
                        player.healer.defence += chainmail.getDefence();
                        player.healer.health += chainmail.getHealth();
                        player.healer.speed += chainmail.getSpeed();
                        player.goldCoins -= chainmail.getPrice();
                        player.healer.price += chainmail.getPrice()*0.2;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                } else if (choice3 == 2) {
                    Armour Regalia = new Armour(105, 0, 1, 0, 0);
                    if (player.goldCoins >= Regalia.getPrice()) {
                        player.healer.attack += Regalia.getAttack();
                        player.healer.defence += Regalia.getDefence();
                        player.healer.health += Regalia.getHealth();
                        player.healer.speed += Regalia.getSpeed();
                        player.goldCoins -= Regalia.getPrice();
                        player.healer.price += Regalia.getPrice()*0.2;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                } else if (choice3 == 3) {
                    Armour fleece = new Armour(150, 0, 2, 1, -1);
                    if (player.goldCoins >= fleece.getPrice()) {
                        player.healer.attack += fleece.getAttack();
                        player.healer.defence += fleece.getDefence();
                        player.healer.health += fleece.getHealth();
                        player.healer.speed += fleece.getSpeed();
                        player.goldCoins -= fleece.getPrice();
                        player.healer.price += fleece.getPrice()*0.2;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                }

            } else if (choice2 == 2) {
                print("Your gold points: "+player.goldCoins);
                //System.out.println("Which artefact do you want to apply?\n1).Excalibur : cost=150\n2).Amulet : cost=200 +\n3).crystal : cost=210");
                Table(2);
                int choice3 = In.nextInt();
                if (choice3 == 1) {
                    Artefact Excalibur = new Artefact(150, 2, 0, 0, 0);
                    if (player.goldCoins >= Excalibur.getPrice()) {
                        player.healer.attack += Excalibur.getAttack();
                        player.healer.defence += Excalibur.getDefence();
                        player.healer.health += Excalibur.getHealth();
                        player.healer.speed += Excalibur.getSpeed();
                        player.goldCoins -= Excalibur.getPrice();
                        player.healer.price += Excalibur.getPrice()*0.2;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                } else if (choice3 == 2) {
                    Artefact amulet = new Artefact(200, 1, -1, +1, +1);
                    if (player.goldCoins >= amulet.getPrice()) {
                        player.healer.attack += amulet.getAttack();
                        player.healer.defence += amulet.getDefence();
                        player.healer.health += amulet.getHealth();
                        player.healer.speed += amulet.getSpeed();
                        player.goldCoins -= amulet.getPrice();
                        player.healer.price += amulet.getPrice()*0.2;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                } else if (choice3 == 3) {
                    Artefact crystal = new Artefact(210,2,1,-1,-1);
                    if (player.goldCoins >= crystal.getPrice()) {
                        player.healer.attack += crystal.getAttack();
                        player.healer.defence += crystal.getDefence();
                        player.healer.health += crystal.getHealth();
                        player.healer.speed += crystal.getSpeed();
                        player.goldCoins -= crystal.getPrice();
                        player.healer.price += crystal.getPrice()*0.2;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                }


            }

        } else if (choice1 ==5) {
            print("which Equipment do you want to apply?\n1).Armour\n2).Artefact");
            int choice2 = In.nextInt();
            if (choice2 == 1) {
                print("your gold coins :"+player.goldCoins);
                //System.out.println("Which armour do you want to apply?\n1).Chainmail : cost=70\n2).Regalia : cost= 105\n3).Fleece : cost= 150");
                Table(1);
                int choice3 = In.nextInt();
                if (choice3 == 1) {
                    Armour chainmail = new Armour(70, 0, 1, 0, -1);
                    if (player.goldCoins >= chainmail.getPrice()) {
                        player.mythicalCreature.attack += chainmail.getAttack();
                        player.mythicalCreature.defence += chainmail.getDefence();
                        player.mythicalCreature.health += chainmail.getHealth();
                        player.mythicalCreature.speed += chainmail.getSpeed();
                        player.goldCoins -= chainmail.getPrice();
                        player.mythicalCreature.price += chainmail.getPrice()*0.2;
                    }else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                } else if (choice3 == 2) {
                    Armour Regalia = new Armour(105, 0, 1, 0, 0);
                    if (player.goldCoins >= Regalia.getPrice()) {
                        player.mythicalCreature.attack += Regalia.getAttack();
                        player.mythicalCreature.defence += Regalia.getDefence();
                        player.mythicalCreature.health += Regalia.getHealth();
                        player.mythicalCreature.speed += Regalia.getSpeed();
                        player.goldCoins -= Regalia.getPrice();
                        player.mythicalCreature.price += Regalia.getPrice()*0.2;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                } else if (choice3 == 3) {
                    Armour fleece = new Armour(150, 0, 2, 1, -1);
                    if (player.goldCoins >= fleece.getPrice()) {
                        player.mythicalCreature.attack += fleece.getAttack();
                        player.mythicalCreature.defence += fleece.getDefence();
                        player.mythicalCreature.health += fleece.getHealth();
                        player.mythicalCreature.speed += fleece.getSpeed();
                        player.goldCoins -= fleece.getPrice();
                        player.mythicalCreature.price += fleece.getPrice()*0.2;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                }

            } else if (choice2 == 2) {
                print("Your gold points: "+player.goldCoins);
                //System.out.println("Which artefact do you want to apply?\n1).Excalibur : cost=150\n2).Amulet : cost=200 +\n3).crystal : cost=210");
                Table(2);
                int choice3 = In.nextInt();
                if (choice3 == 1) {
                    Artefact Excalibur = new Artefact(150, 2, 0, 0, 0);
                    if (player.goldCoins >= Excalibur.getPrice()) {
                        player.mythicalCreature.attack += Excalibur.getAttack();
                        player.mythicalCreature.defence += Excalibur.getDefence();
                        player.mythicalCreature.health += Excalibur.getHealth();
                        player.mythicalCreature.speed += Excalibur.getSpeed();
                        player.goldCoins -= Excalibur.getPrice();
                        player.mythicalCreature.price += Excalibur.getPrice()*0.2;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                } else if (choice3 == 2) {
                    Artefact amulet = new Artefact(200, 1, -1, +1, +1);
                    if (player.goldCoins >= amulet.getPrice()) {
                        player.mythicalCreature.attack += amulet.getAttack();
                        player.mythicalCreature.defence += amulet.getDefence();
                        player.mythicalCreature.health += amulet.getHealth();
                        player.mythicalCreature.speed += amulet.getSpeed();
                        player.goldCoins -= amulet.getPrice();
                        player.mythicalCreature.price += amulet.getPrice()*0.2;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                } else if (choice3 == 3) {
                    Artefact crystal = new Artefact(210,2,1,-1,-1);
                    if (player.goldCoins >= crystal.getPrice()) {
                        player.mythicalCreature.attack += crystal.getAttack();
                        player.mythicalCreature.defence += crystal.getDefence();
                        player.mythicalCreature.health += crystal.getHealth();
                        player.mythicalCreature.speed += crystal.getSpeed();
                        player.goldCoins -= crystal.getPrice();
                        player.mythicalCreature.price += crystal.getPrice()*0.2;
                    }
                    else{
                        print("You don't have enough gold coins to buy this equipment");
                    }

                }

            }

        }
    }



    public static Map<character, Integer> sortByValue(Map<character, Integer> map) {
        // Convert the map to a list of entries
        List<Map.Entry<character, Integer>> entryList = new ArrayList<>(map.entrySet());

        // Sort the list by value
        Collections.sort(entryList, Comparator.comparing(Map.Entry::getValue));

        // Create a new LinkedHashMap to maintain the insertion order
        Map<character, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<character, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
    private static void getTurnOrder(Player player) {
        ArrayList<character> characters = new ArrayList<character>(player.getArmy().keySet());
        List<String> precedenceOrder = Arrays.asList(
                "Archer", "Knight","MythicalCreature", "Mage", "Healer"  );
        boolean swap=true;
        while (swap){
            for (int i =0 ; i< 4; i++){
                if (characters.get(i).speed != characters.get(i+1).speed){
                    continue;
                } else {


                    int n1 = precedenceOrder.indexOf(characters.get(i).getSupName());
                    int n2 = precedenceOrder.indexOf(characters.get(i+1).getSupName());

                    if (n1 > n2){
                        character temp = characters.get(i);
                        characters.add(i,characters.get(i+1));
                        characters.add(i+1 , temp);

                    }else{
                        swap = false;
                    }
                }
            }

        }
        LinkedHashMap<character, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(characters.get(0),characters.get(0).speed);
        linkedHashMap.put(characters.get(1),characters.get(1).speed);
        linkedHashMap.put(characters.get(2),characters.get(2).speed);
        linkedHashMap.put(characters.get(3),characters.get(3).speed);
        linkedHashMap.put(characters.get(4),characters.get(4).speed);
        player.setArmy(linkedHashMap);



    }
    public static void restore(Player player){
        Map<character,Integer> map=player.getArmy();
        Map<character,Integer> Rmap=new LinkedHashMap<character, Integer>();
        for (Map.Entry<character, Integer> entry : map.entrySet()) {
            Rmap.put(entry.getKey(), entry.getValue());
        }
        player.setArmy(Rmap);
    }
    public static void main (String[]args) {
        Entry(args);
        ArrayList<String> UserNames = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        print("Hello welcome to the Mystic Mayhem");
        Wait(500);
        print("What is your Name: ");
        String name = input.nextLine();
        print("What is your user name:");
        String userName = input.nextLine();
        while(UserNames.contains(userName)){
            print(" username is already taken and should be prompted to enter a new username...");
            userName = input.nextLine();
        }
        UserNames.add(userName);

        Player player = new Player(name, userName, 0, 500);
        print("select Your Home Ground : \n1).Hillcrest\n2).Marshland\n3).Desert\n4).Arcane");
        System.out.println();
        int choice = input.nextInt();

        if (choice == 1) {
            player.setHomeground("Hillcrest");
        } else if (choice == 2) {
            player.setHomeground("Marshland");
        } else if (choice == 3) {
            player.setHomeground("Desert");
        } else if (choice == 4) {
            player.setHomeground("Arcane");
        } else {
            print("invalid input");
        }

        while (count < 5 ) {
            Buy(player);
        }
        //To buy eqiupments
        print("Your Gold coins: "+ player.goldCoins);
        while(flag){
            buyEquipments(player);
        }

        print("Your Army:");
        player.playerstatus();
        System.out.println();
        Player Enemy = getEnemy(UserNames);
        print("Your Enemy::"+Enemy.getUserName());
        Enemy.Displayplayer();
        System.out.println();

        Battlegound(player,Enemy);
        getTurnOrder(Enemy);

        Map<character, Integer> map = new LinkedHashMap<>();
        map.put(player.archer, player.archer.speed);
        map.put(player.knight, player.knight.speed);
        map.put(player.mage, player.mage.speed);
        map.put(player.healer, player.healer.speed);
        map.put(player.mythicalCreature, player.mythicalCreature.speed);
        Map<character , Integer> speedmap =  sortByValueDescending(map);
        player.setArmy(speedmap);

        getTurnOrder(player);

        print("Do You Want to Battle with White Wolf??\n1).Yes\n2).skip");
        int choice1 = input.nextInt();
        if (choice1 == 1){
            Attack(player,Enemy);
        } else if (choice1 == 2) {
            //get next enemy

            print("Your Army:");
            player.playerstatus();
            Enemy = getNextEnemy(UserNames);
            print("Your Enemy::"+Enemy.getUserName());
            Enemy.Displayplayer();

            //Battlegound(player,Enemy);
            //getTurnOrder(Enemy);
            print("Do You Want to Battle with "+Enemy.getUserName()+"??\n1).Yes\n2).skip");
            int choice2 = input.nextInt();
            if (choice2 == 1){
                Attack(player,Enemy);

            }else {
                print("You only have one chance to skip a Enemy ....Try again!!!!");
            }

        }
        restore(player);
        print(player.getUserName()+" XP :"+player.XP+"    Gold Coins : "+player.goldCoins);
        print(Enemy.getUserName()+" XP :"+Enemy.XP+"    Gold Coins : "+Enemy.goldCoins);




    }
};
