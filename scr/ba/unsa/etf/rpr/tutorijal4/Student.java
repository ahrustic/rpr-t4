package ba.unsa.etf.rpr.tutorijal4;

public class Student {
    private String ime, prezime;
    private int brojIndexa;
    private int ects;
    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
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

}
