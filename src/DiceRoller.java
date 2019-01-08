import java.util.Random;

public class DiceRoller {

    public static int rollDice(int face, int nbDice) {
        int resultat = 0;
        for(int i = 1; i <= nbDice; i++) {
            int random = 1 + (int)(Math.random() * (face - 1));
            System.out.println("i: " + i + " = " +random);
            resultat += random;
        }

        return resultat;
    }
}
