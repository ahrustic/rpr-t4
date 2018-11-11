package ba.unsa.etf.rpr.tutorijal4;

import java.util.ArrayList;
import java.util.Set;

public class Predmet {
    private String nazivPredmeta, imeIPrezimeProfesora;
    private  int ECTS;
    private int brojStudenata;
    private int maxBrojStudenata;
    private ArrayList<Student> spisakStudenata;

    public Predmet(String naziv, String ime, int ects, int broj, int max) {
        this.nazivPredmeta = naziv;
        this.imeIPrezimeProfesora = ime;
        this.ECTS = ects;
        this.brojStudenata = broj;
        this.maxBrojStudenata = max;
    }

    public Predmet(String nazivPredmeta, String imeIPrezimeProfesora) {
        this.nazivPredmeta = nazivPredmeta;
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public String getImeIPrezimeProfesora() {
        return imeIPrezimeProfesora;
    }

    public int getECTS() {
        return ECTS;
    }

    public int getBrojStudenata() {
        return brojStudenata;
    }

    public int getMaxBrojStudenata() {
        return maxBrojStudenata;
    }

    public void dodajStudenta(Student student){
        spisakStudenata.add(student);
    }

    public void ispisiStudenta(Student student) {
        spisakStudenata.remove(student);
    }

    public String vratiNazivPredmeta() {
        return nazivPredmeta;
    }

    public String vratiSpisakUpisanihStudenata() {
        String spisakUpisanihStudenata = "";
        for (int i = 1; i <= spisakStudenata.size() ; i++)
            spisakUpisanihStudenata += i + ". " + spisakStudenata.get(i - 1).getIme() + " " + spisakStudenata.get(i - 1).getPrezime() + "\n";
        return spisakUpisanihStudenata;
    }
}
