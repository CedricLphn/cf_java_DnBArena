import java.util.ArrayList;
import java.util.Scanner;

public class Personnages {
    private ArrayList<Personnage> perso = new ArrayList<>();
    private ArrayList<Personnage> monsters = new ArrayList<>();


    public void createCharacters() {
        String line;
        Scanner scan = new Scanner(System.in);
        System.out.println("=== Création des personnages ===");
        do {

            this.perso.add(create());

            System.out.println("Create another player ? (Y/N) ");
            line = scan.nextLine();


        }while(!line.equals("n"));

        System.out.println(this.perso.toString());
    }

    public void createMonster() {
        String line;
        Scanner scan = new Scanner(System.in);

        System.out.println("=== Création des monstres ===");
        do {

            this.monsters.add(create());

            System.out.println("Create another monster ? (Y/N) ");
            line = scan.nextLine();


        }while(!line.equals("n"));

        System.out.println(this.monsters.toString());
    }

    private static Personnage create() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nom: ");
        String name = scan.nextLine();
        System.out.println("Exp: ");
        int exp = Integer.parseInt(scan.nextLine());
        System.out.println("Agility: ");
        int agility = Integer.parseInt(scan.nextLine());
        System.out.println("Stamina: ");
        int stamina = Integer.parseInt(scan.nextLine());

        return new Personnage(name, agility, stamina, exp);
    }
}
