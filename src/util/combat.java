package util;

public class combat {
    public static int [] testCombat(int [] equipment, int strength, int agility, int intelligence, int attack, int defence, int [] hpMP){
        int playerHP = hpMP[1];
        int playerMP = hpMP[3];
        int enemyHP = 100;
        int enemyAttack = 15;
        int enemyArmor = 10;
        int gold = 0;
        int experience = 0;
        int playerChoice = 0;
        int [] results = {0,0,0,0};
        int weapon = stats_inventory.weaponValue(equipment);
        int armor = stats_inventory.armorValue(equipment);
        int helm = stats_inventory.helmValue(equipment);
        int totalArmor = defence+helm+armor;
        System.out.println("Total armor is "+totalArmor);
        int totalAttack = attack+weapon;
        System.out.println("Total attack is "+totalAttack);
        boolean battle = true;
        System.out.println("HARK, a Test Goblin approaches, steel thyself!");
        ascii.goblin();
        do {
            if (playerHP<=0){
                Game.gameOver();
            }
            stats_inventory.combatStats(playerHP,playerMP,totalAttack,totalArmor);
            playerChoice = combatChoice();
        }while (battle);
        return results;
    }

    public static int combatChoice(){
        System.out.println("What will you do?");
        System.out.println("1. ATTACK");
        System.out.println("2. DEFEND");
        System.out.println("3. MAGIC");
        System.out.println("4. DRINK HP POTION");
        System.out.println("5. DRINK MP POTION");
        System.out.println("6. THROW FIRE FLASK");
        System.out.println("7. RUN");
        return Input.getIntSilent(1,7);
    }
}
