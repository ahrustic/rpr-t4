package ba.unsa.etf.rpr.tutorijal4;

import java.util.Set;

public class Student {
    private String ime, prezime;
    private int brojIndexa;
    private int ects;
    private Set<Predmet> predmeti;

    public int getEcts() {
        return ects;
    }

    public Student() {}

    public Student(String ime, String preezime, int bi, int poeni) {
        this.ime = ime;
        this.prezime = preezime;
        this.brojIndexa = bi;
        this.ects = poeni;
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

    public void upisiStudentaNaPredmet(Predmet predmet) throws IllegalArgumentException{
        if (ects + predmet.getECTS() > 30) throw new IllegalArgumentException();
        predmeti.add(predmet);
    }

    public void ispisiStudentaSaPredmeta(Predmet predmet){
        predmeti.remove(predmet);
        predmet.ispisiStudenta(this);
    }
}
