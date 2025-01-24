import java.util.ArrayList;

public class Fattoria {
    ArrayList<Animale> animali;

    public Fattoria() {
        animali = new ArrayList<Animale>();
    }

    public void aggiungiAnimale(Animale a) {
        animali.add(a);
    }

    public void rimuoviAnimale(Animale a) {
        animali.remove(a);
    }

    public void buongiorno() {
        for (Animale a : animali) {
            //animali.mangia();
            //animali.corri();
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (Animale a : animali) {
            s += a + "\n";
        }
        return s;
    }
}
