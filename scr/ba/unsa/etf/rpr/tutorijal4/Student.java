package ba.unsa.etf.rpr.tutorijal4;

import ba.unsa.etf.rpr.tutorijal4.PodaciOSemestru;

import java.util.ArrayList;

public class Student {
    private String ime, prezime;
    private int brojIndexa;
    private ArrayList<PodaciOSemestru> arhiva;

    public Student() {}

    public Student(String ime, String preezime, int bi) {
        this.ime = ime;
        this.prezime = preezime;
        this.brojIndexa = bi;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getBrojIndexa() {
        return brojIndexa;
    }

}
