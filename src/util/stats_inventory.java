package util;

public class stats_inventory {
    public static void listStats (String name, int job, int strength, int intelligence, int agility, int luck ){
        System.out.println("NAME: "+name.toUpperCase());
        System.out.print("JOB: ");
        switch (job){
            case 1:
                System.out.println("WAREHOUSE WORKER");
                break;
            case 2:
                System.out.println("LIBRARIAN");
                break;
            case 3:
                System.out.println("WINDOW WASHER");
                break;
            case 4:
                System.out.println("GRIFTER");
                break;
        }
        System.out.println("STRENGTH: "+strength);
        System.out.println("INTELLIGENCE: "+intelligence);
        System.out.println("AGILITY: "+agility);
        System.out.println("LUCK: "+luck);
    }

    public static int [] inventoryTest (int [] inventory){
        System.out.println("Check it out, a full set of traffic armor!\nGOT CONE HELM\nGOT REFLECTIVE VEST\nGOT STOP SIGN");
        inventory[0] = 1;
        inventory[1] = 1;
        inventory[3] = 1;
        return inventory;
    }
    public static int armorValue (int [] equipment){
        int armor = 0;
        switch (equipment[1]){
            case 0:
                break;
            case 1:
                armor = 3;
                break;
        }
        System.out.println("Armor is " +armor);
        return armor;
    }

    public static int helmValue (int [] equipment){
        int helm = 0;
        switch (equipment [3]){
            case 0:
                break;
            case 1:
                helm = 2;
                break;
        }
        System.out.println("Helm is " +helm);
        return helm;
    }

    public static int weaponValue (int [] equipment){
        int weapon = 0;
        switch (equipment[0]){
            case 0:
                break;
            case 1:
                weapon = 5;
                break;
        }
        System.out.println("Weapon is "+weapon);
        return weapon;
    }

    public static void combatStats (int hp, int mp, int totalAttack, int totalArmor){
        System.out.println("HP: "+hp);
        System.out.println("MP: "+mp);
        System.out.println("ATTACK: "+totalAttack);
        System.out.println("DEFENCE: "+totalArmor);
    }
}
