public class Archer extends Enemy{
    private int obratnost;

    public Archer(String jmeno, int sila, int level, int exp, int obratnost) {
        super(jmeno, sila, level, exp);
        this.obratnost = obratnost;
    }
    public String souboj(Wizard rival) {
        if ((this.sila*this.level*this.obratnost)>(rival.sila*rival.level*rival.getInteligence())){
            System.out.println("Vyhrál: " + this.getJmeno() + " :)");
        }
        else if ((this.sila*this.level*this.obratnost)==(rival.sila*rival.level*rival.getInteligence())) {
            System.out.println("Remíza :/");
        } else {
            System.out.println("Vyhrál:" + rival.getJmeno() + " :(");
        }
        return "";
    }

    @Override
    public String toString() {
        return "Archer{" +
                "obratnost=" + obratnost +
                ", jmeno='" + jmeno + '\'' +
                ", sila=" + sila +
                ", level=" + level +
                ", exp=" + exp +
                '}';
    }

    public int getObratnost() {
        return this.obratnost;
    }

    public void setObratnost(int obratnost) {
        this.obratnost = obratnost;
    }
}
