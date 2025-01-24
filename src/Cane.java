public class Cane extends Animale {
    
    public Cane() {
        super("Cane", "Cane", "Bau", "Corre");
    }

    public Cane(String specie, String verso, String movimento) {
        super("Canis", specie, verso, movimento);
    }


    @Override
    public String toString() {
        return "Genere: " + getGenere() + "\nSpecie: " + getSpecie() + "\nVerso: " + getVerso();
    }
}
