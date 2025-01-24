public class Cane extends Animale implements Nutrimento {
    
    public Cane() {
        super("Cane", "Cane", "Bau", "Corre");
    }

    public Cane(String specie, String verso, String movimento) {
        super("Canis", specie, verso, movimento);
        this.peso = 1.0;
    }

    public String mangia() {
        peso += 0.5;
        return "Il cane ha mangiato e ora pesa " + peso + " kg";
    }


    @Override
    public String toString() {
        return "Genere: " + getGenere() + "\nSpecie: " + getSpecie() + "\nVerso: " + getVerso();
    }
}
