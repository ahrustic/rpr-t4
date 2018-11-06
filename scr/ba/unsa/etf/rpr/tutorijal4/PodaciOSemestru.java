package ba.unsa.etf.rpr.tutorijal4;

import java.util.ArrayList;
import java.util.Date;

public class PodaciOSemestru {
    private Date datumUpisa, datumOvjere;
    private int brojSemestra, smjerID;

    public PodaciOSemestru(Date upis, Date ovjera, int broj, int id) {
        this.datumUpisa = upis;
        this.datumOvjere = ovjera;
        this.brojSemestra = broj;
        this.smjerID = id;
    }

    private ArrayList<Predmet> predmetiKojeSlusaju;



    public void setDatumUpisa(Date datumUpisa) {
        this.datumUpisa = datumUpisa;
    }

    public void setDatumOvjere(Date datumOvjere) {
        this.datumOvjere = datumOvjere;
    }

    public void setBrojSemestra(int brojSemestra) {
        this.brojSemestra = brojSemestra;
    }

    public void setPredmetiKojeSlusaju(ArrayList<Predmet> predmetiKojeSlusaju) {
        this.predmetiKojeSlusaju = predmetiKojeSlusaju;
    }

    public Date getDatumUpisa() {
        return datumUpisa;
    }

    public Date getDatumOvjere() {
        return datumOvjere;
    }

    public int getBrojSemestra() {
        return brojSemestra;
    }

    public int getSmjerID() {
        return smjerID;
    }

    public ArrayList<Predmet> getPredmetiKojeSlusaju() {
        return predmetiKojeSlusaju;
    }




}
