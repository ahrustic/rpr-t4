package ba.unsa.etf.rpr.tutorijal4;

import java.util.List;

public class PlanStudija {

    private String naziv;
    private List<Predmet> spisakObaveznihPredmeta;
    private List<Predmet> spisakIzbornihPredmeta;

    public PlanStudija(String naziv, List<Predmet> spisakObaveznihPredmeta, List<Predmet> spisakIzbornihPredmeta){
        this.naziv = naziv;
        this.spisakObaveznihPredmeta = spisakObaveznihPredmeta;
        this.spisakIzbornihPredmeta = spisakIzbornihPredmeta;
    }

    public String vratiNazivStudija() {
        return naziv;
    }
    public String vratiSpisakObaveznihPredmeta() {
        String spisakPredmeta = "";
        for (int i = 1; i <= spisakObaveznihPredmeta.size() ; i++)
            spisakPredmeta += i + ". " + spisakObaveznihPredmeta.get(i - 1).vratiNazivPredmeta() + "\n";
        return spisakPredmeta;
    }
    public String vratiSpisakIzbornihPredmeta() {
        String spisakPredmeta = "";
        for (int i = 1; i <= spisakIzbornihPredmeta.size() ; i++)
            spisakPredmeta += i + ". " + spisakIzbornihPredmeta.get(i - 1).vratiNazivPredmeta() + "\n";
        return spisakPredmeta;
    }
    public void dodajObavezniPredmet(Predmet predmet) {
        spisakObaveznihPredmeta.add(predmet);
    }
    public void dodajIzborniPredmet(Predmet predmet) {
        spisakIzbornihPredmeta.add(predmet);
    }
    public void ukloniObavezniPredmet(Predmet predmet) {
        spisakObaveznihPredmeta.remove(predmet);
    }
    public void ukloniIzborniPredmet(Predmet predmet) {
        spisakIzbornihPredmeta.remove(predmet);
    }
}



