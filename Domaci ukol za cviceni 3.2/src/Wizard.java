import java.lang.invoke.MethodHandles;

public class Wizard extends Enemy{
    private int inteligence;

    public Wizard(String jmeno, int sila, int level, int exp, int inteligence) {
        super(jmeno, sila, level, exp);
        this.inteligence = inteligence;
    }

    public String souboj(Archer rival) {
        if ((this.sila*this.level*this.inteligence)>(rival.sila*rival.level*rival.getObratnost())){
            System.out.println("Vyhrál: " + this.getJmeno() + " :)");
        }
        else if ((this.sila*this.level)==(rival.sila*rival.level*rival.getObratnost())) {
            System.out.println("Remíza :/");
        } else {
            System.out.println("Vyhrál:" + rival.getJmeno() + " :(");
        }
        return "";
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "inteligence=" + inteligence +
                ", jmeno='" + jmeno + '\'' +
                ", sila=" + sila +
                ", level=" + level +
                ", exp=" + exp +
                '}';
    }

    public int getInteligence() {
        return inteligence;
    }

    public void setInteligence(int inteligence) {
        this.inteligence = inteligence;
    }
}
