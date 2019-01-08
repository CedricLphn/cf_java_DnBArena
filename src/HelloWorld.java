public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Welcome to D&D Arena\n\n");
        Personnages perso = new Personnages();
        perso.createCharacters();
        perso.createMonster();
    }
}
