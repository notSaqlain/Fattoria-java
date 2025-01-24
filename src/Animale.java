public class Animale {

    private String genere;
    private String specie;
    private String verso;
    private String movimento;

    public Animale() {
        this.genere = "Animale";
        this.specie = "Animale";
        this.verso = "Animale";
        this.movimento = "Animale";
    }

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
        return "";
    }

    public String getSpecie() {
        return "";
    }

    public String getMoimento() {
        return "";
    }
}
