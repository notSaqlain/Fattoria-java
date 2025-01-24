public abstract class Animale {

    private String genere;
    private String specie;
    private String verso;
    private String movimento;

    public Animale(String genere, String specie, String verso, String movimento) {
        this.genere = genere;
        this.specie = specie;
        this.verso = verso;
        this.movimento = movimento;
    }

    public String getGenere() {
        return genere;
    }

    public String getVerso() {
        return verso;
    }

    public String getSpecie() {
        return specie;
    }

    public String getMoimento() {
        return movimento;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public void setVerso(String verso) {
        this.verso = verso;
    }

    public void setMovimento(String movimento) {
        this.movimento = movimento;
    }

    @Override
    public String toString() {
        return "Genere: " + genere + "\nSpecie: " + specie + "\nVerso: " + verso + "\nMovimento: " + movimento;
    }
}
