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
}
