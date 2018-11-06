package ba.unsa.etf.rpr.tutorijal4;

import java.util.ArrayList;

public class Predmet {
    private String nazivPredmeta, imeIPrezimeProfesora;
    private  int ECTS;
    private int brojStudenata;
    private int predmetID;
    private int maxBrojStudenata;

    public Predmet(String naziv, String ime, int ects, int broj, int max, int id) {
        this.nazivPredmeta = naziv;
        this.imeIPrezimeProfesora = ime;
        this.ECTS = ects;
        this.brojStudenata = broj;
        this.maxBrojStudenata = max;
        this.predmetID = id;
    }

    private ArrayList<Student> studenti;



    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
    }

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }

    public void setBrojStudenata(int brojStudenata) {
        this.brojStudenata = brojStudenata;
    }

    public void setPredmetID(int predmetID) {
        this.predmetID = predmetID;
    }

    public void setMaxBrojStudenata(int maxBrojStudenata) {
        this.maxBrojStudenata = maxBrojStudenata;
    }

    public void setStudenti(ArrayList<Student> studenti) {
        this.studenti = studenti;
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

    public int getPredmetID() {
        return predmetID;
    }

    public int getMaxBrojStudenata() {
        return maxBrojStudenata;
    }

    public ArrayList<Student> getStudenti() {
        return studenti;
    }




}
