public class Student {
    protected String jmeno;
    protected  String prijmeni;
    protected String trida;
    protected  double prumer;

    public Student(String jmeno, String prijmeni, String trida, double prumer) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.trida = trida;
        this.prumer = prumer;
    }

    @Override
    public String toString() {
        return "Student{" +
                "jmeno='" + jmeno + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                ", trida='" + trida + '\'' +
                ", prumer=" + prumer +
                '}';
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getTrida() {
        return trida;
    }

    public void setTrida(String trida) {
        this.trida = trida;
    }

    public double getPrumer() {
        return prumer;
    }

    public void setPrumer(double prumer) {
        this.prumer = prumer;
    }
}
