import java.util.HashMap;

public class Personnage {

    private String name;
    private int level;
    private int agility;
    private int stamina;
    private int exp;
    private HashMap<String, Integer> caracs;



    public Personnage(String name, int agility, int stamina, int exp) {
        caracs = new HashMap<>();

        this.name = name;
        caracs.put("AGILITY", agility);
        caracs.put("STAMINA", stamina);
        caracs.put("LEVEL", 0);
        setExp(exp);
    }

    public int getLevel() {
        return caracs.get("LEVEL");
    }

    public int getAgility() {
        return caracs.get("AGILITY");
    }

    public String getName() {
        return this.name;
    }

    public int getStamina() {
        return caracs.get("STAMINA");
    }

    public int getExp() {
        return caracs.get("EXP");
    }

    public void setLevel(int level) {
        caracs.put("LEVEL", level);
    }

    public void setAgility(int agility) {
        caracs.put("AGILITY", agility);
    }

    public void setExp(int exp) {
        Integer get;
        if(caracs.get("EXP") != null) {
            get = caracs.get("EXP");
            get += exp;

        }else {
            get = exp;
        }

        caracs.put("EXP", get);
        setLevel(get / 1000);
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public String toString() {
        String result = "Name: "+ getName() +"\n";
        result += "Level : "+getLevel() + " EXP : " + getExp()+"\n";
        result += "Agility : "+getAgility()+"\n";
        result += "Stamina : "+ getStamina()+"\n\n";

        return result;

    }
}
