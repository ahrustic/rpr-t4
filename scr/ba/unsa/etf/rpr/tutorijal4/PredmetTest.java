package ba.unsa.etf.rpr.tutorijal4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void getNazivPredmeta() {
        Predmet p = new Predmet("RPR", "Vedran Ljubovic");
        assertEquals("RPR", p.getNazivPredmeta());
    }

    @Test
    void getImeIPrezimeProfesora() {
        Predmet p = new Predmet("RPR", "Vedran Ljubovic");
        assertEquals("Vedran Ljubovic", p.getImeIPrezimeProfesora());

    }

    @Test
    void getECTS() {
        Predmet p = new Predmet("RPR", "Vedran Ljubovic", 10, 70, 100);
        assertEquals(10, p.getECTS());
    }

    @Test
    void getBrojStudenata() {
        Predmet p = new Predmet("RPR", "Vedran Ljubovic", 10, 70, 100);
        assertEquals(70, p.getBrojStudenata());
    }


    @Test
    void getMaxBrojStudenata() {
        Predmet p = new Predmet("RPR", "Vedran Ljubovic", 10, 70, 100);
        assertEquals(100, p.getMaxBrojStudenata());
    }

    @Test
    void dodajStudenta() {
        Predmet p = new Predmet("RPR", "Vedran Ljubovic");
        p.dodajStudenta(new Student("Amila", "Hrustić", 18120, 0));
        assertEquals("1. Amila Hrustić\n", p.vratiSpisakUpisanihStudenata());
    }

    @Test
    void ispisiStudenta() {
        Predmet p = new Predmet("RPR", "Vedran Ljubovic");
        Student s = (new Student("Amila", "Hrustić", 18120, 0));
        p.dodajStudenta(s);
        p.ispisiStudenta(s);
        assertEquals("", p.vratiSpisakUpisanihStudenata());
    }

    @Test
    void vratiImeProfeora() {
        Predmet p = new Predmet("RPR", "Vedran Ljubovic", 10, 70, 100);
        assertEquals("Vedran Ljubovic", p.getImeIPrezimeProfesora());
    }
}