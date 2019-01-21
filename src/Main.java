import util.Input;

import util.stats_inventory;

import util.ascii;

import java.lang.reflect.Array;
// TODO: Write equipment list
// TODO: Write spell list
// TODO: Write skill list
// TODO: Review potions after core gameplay is finished
// TODO: Combat methods
// TODO: Story
// TODO: Side stuff and merchants
// TODO: Random encounter methods
// TODO: Figure out level up and basic stat balance
public class Main {
    public static void main(String[] args) {
        String playerName = "";
        // Warehouse Worker, Librarian, Window Washer, Grifter
        int job = 0;
        int gold = 0;
        int strength = 5;
        int intelligence = 5;
        int agility = 5;
        int luck = 1;
        int defence = 10;
        int attack = 10;
        // Weapon, Armor, Accessory, Helm
        // Write equipment list
        int [] equipment = {0,0,0,0};
        //Spell list
        // Write Spell list
        int [] spellList = {0,0,0,0,0,0,0,0,0,0};
        // Skill list
        // Write skill list
        int [] skillList = {0,0,0,0,0,0,0,0,0,0};
        //Potions
        // HP, MP, Antidote, Holy Water, Fire Flask
        // Maybe make more potions, if I implement more involved resistances add more damage potions
        int [] potions = {0,0,0,0,0};
        int [] questStuff;
        System.out.println(" __    __           _   _              __   _   _              ___       _   _                __               _ ");
        System.out.println("/ / /\\ \\ \\_ __ __ _| |_| |__     ___  / _| | |_| |__   ___    / _ \\_   _| |_| |_ ___ _ __    / /  ___  _ __ __| |");
        System.out.println("\\ \\/  \\/ / '__/ _` | __| '_ \\   / _ \\| |_  | __| '_ \\ / _ \\  / /_\\/ | | | __| __/ _ \\ '__|  / /  / _ \\| '__/ _` |");
        System.out.println(" \\  /\\  /| | | (_| | |_| | | | | (_) |  _| | |_| | | |  __/ / /_\\\\| |_| | |_| ||  __/ |    / /__| (_) | | | (_| |");
        System.out.println("  \\/  \\/ |_|  \\__,_|\\__|_| |_|  \\___/|_|    \\__|_| |_|\\___| \\____/ \\__,_|\\__|\\__\\___|_|    \\____/\\___/|_|  \\__,_|");
        System.out.println("What is your name?");
        playerName = Input.getString();
        System.out.println(playerName+" it is.");
        System.out.println("And what is your job?");
        System.out.println("1. Warehouse Worker\n2. Librarian\n3. Window Washer\n4. Grifter");
        job = Input.getIntSilent(1,4);
        System.out.println(job);
        switch (job) {
            case 1: strength += 2;
            break;
            case 2: intelligence += 2;
            break;
            case 3: agility += 2;
            break;
            case 4: luck += 2;
            break;
        }
        stats_inventory.listStats(playerName,job,strength,intelligence,agility,luck);
        ascii.beetle();
        Input.waitForEnter();
    }
}
