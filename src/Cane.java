public class Cane extends Animale implements Nutrimento {
    
    public Cane() {
        super("Cane", "Cane", "Bau", "Corre");
    }

    public Cane(String specie, String verso, String movimento) {
        super("Canis", specie, verso, movimento);
        this.peso = 1.0;
    }


    @Override
    public String toString() {
        return "Genere: " + getGenere() + "\nSpecie: " + getSpecie() + "\nVerso: " + getVerso();
    }
}
