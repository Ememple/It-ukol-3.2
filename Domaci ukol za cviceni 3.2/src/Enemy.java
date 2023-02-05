public class Enemy {
    protected String jmeno;
    protected  int sila;
    protected  int level;
    protected  int exp;

    public String souboj(Enemy rival) {
        if ((this.sila*this.level)>(rival.sila*rival.level)) {
            System.out.println("Vyhrál: " + this.getJmeno() + " :)");
        }
        else if ((this.sila*this.level)==(rival.sila*rival.level)) {
            System.out.println("Remíza :/");
        } else {
            System.out.println("Vyhrál:" + rival.getJmeno() + " :(");
        }
        return "";
    }

    public Enemy(String jmeno, int sila, int level, int exp) {
        this.jmeno = jmeno;
        this.sila = sila;
        this.level = level;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "jmeno='" + jmeno + '\'' +
                ", sila=" + sila +
                ", level=" + level +
                ", exp=" + exp +
                '}';
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getSila() {
        return sila;
    }

    public void setSila(int sila) {
        this.sila = sila;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
