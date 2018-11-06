package ba.unsa.etf.rpr.tutorijal4;

public class Semestar {

    private int semestarID;
    private int brojIzbornih;
    private int brojObaveznih;
    private int potrebniEcts;


    public Semestar(int semestarID, int izborni, int obavezni, int ects) {
        this.semestarID = semestarID;
        this.brojIzbornih = izborni;
        this.brojObaveznih = obavezni;
        this.potrebniEcts = ects;
    }

    public void setSemestarID(int semestarID) {
        this.semestarID = semestarID;
    }

    public void setBrojIzbornih(int brojIzbornih) {
        this.brojIzbornih = brojIzbornih;
    }

    public void setBrojObaveznih(int brojObaveznih) {
        this.brojObaveznih = brojObaveznih;
    }

    public int getSemestarID() {
        return semestarID;
    }

    public int getBrojIzbornih() {
        return brojIzbornih;
    }

    public int getBrojObaveznih() {
        return brojObaveznih;
    }

    public int getPotrebniEcts() {
        return potrebniEcts;
    }



}
