import java.util.HashMap;

public class Personnage {

    private String name;
    private HashMap<Characteristics, Integer> caracs;



    public Personnage(String name, int agility, int stamina, int exp) {
        caracs = new HashMap<>();

        this.name = name;
        caracs.put(Characteristics.Agility, agility);
        caracs.put(Characteristics.Stamina, stamina);
        caracs.put(Characteristics.Level, 0);

        setExp(exp);
    }

    public Integer get(Characteristics key) {
        return caracs.get(key);
    }

    public int getLevel() {
        return caracs.get(Characteristics.Level);
    }

    public int getAgility() {
        return caracs.get(Characteristics.Agility);
    }

    public String getName() {
        return this.name;
    }

    public int getStamina() {
        return caracs.get(Characteristics.Stamina);
    }

    public int getExp() {
        return caracs.get(Characteristics.Exp);
    }

    public void setLevel(int level) {
        caracs.put(Characteristics.Level, level);
    }

    public void setAgility(int agility) {
        caracs.put(Characteristics.Agility, agility);
    }

    public void setExp(int exp) {
        Integer get;
        if(caracs.get(Characteristics.Level) != null) {
            get = caracs.get(Characteristics.Level);
            get += exp;

        }else {
            get = exp;
        }

        caracs.put(Characteristics.Level, get);
        setLevel(get / 1000);
    }

    public String toString() {
        String result = "Name: "+ getName() +"\n";
        result += "Level : "+getLevel() + " EXP : " + getExp()+"\n";
        result += "Agility : "+getAgility()+"\n";
        result += "Stamina : "+ getStamina()+"\n\n";

        return result;

    }
}
