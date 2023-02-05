public class RozsirenyStudent extends Student{
    private boolean pokemonKarticky;

    public RozsirenyStudent(String jmeno, String prijmeni, String trida, double prumer, boolean pokemonKarticky) {
        super(jmeno, prijmeni, trida, prumer);
        this.pokemonKarticky = pokemonKarticky;
    }

    @Override
    public String toString() {
        return "RozsirenyStudent{" +
                "pokemonKarticky=" + pokemonKarticky +
                ", jmeno='" + jmeno + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                ", trida='" + trida + '\'' +
                ", prumer=" + prumer +
                '}';
    }

    public boolean isPokemonKarticky(boolean b) {
        return pokemonKarticky;
    }

    public void setPokemonKarticky(boolean pokemonKarticky) {
        this.pokemonKarticky = pokemonKarticky;
    }
}
