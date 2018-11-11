package Test;

import ba.unsa.etf.rpr.tutorijal4.PlanStudija;
import ba.unsa.etf.rpr.tutorijal4.Predmet;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlanStudijaTest {

    @Test
    void vratiNazivStudija() {
        PlanStudija p = new PlanStudija("RI", null, null);
        assertEquals("RI", p.vratiNazivStudija());
    }

    @Test
    void vratiSpisakObaveznihPredmeta() {
        ArrayList<Predmet> obavezniPredmeti = new ArrayList<>();
        obavezniPredmeti.add(new Predmet("Razvoj programskih rjesenja", "Vedran Ljubovic"));
        obavezniPredmeti.add(new Predmet("Diskretna matematika", "Zeljko Juric"));
        PlanStudija p = new PlanStudija("RI", obavezniPredmeti, null);
        assertEquals("1. Razvoj programskih rjesenja\n2. Diskretna matematika\n", p.vratiSpisakObaveznihPredmeta());


    }

    @Test
    void vratiSpisakIzbornihPredmeta() {
        ArrayList<Predmet> izborniPredmeti = new ArrayList<>();
        izborniPredmeti.add(new Predmet("Numericki algoritmi", "Zeljko Juric"));
        izborniPredmeti.add(new Predmet("Sistemsko programiranje", "Samir Ribic"));
        PlanStudija p = new PlanStudija("RI", null, izborniPredmeti);
        assertEquals("1. Numericki algoritmi\n2. Sistemsko programiranje\n", p.vratiSpisakIzbornihPredmeta());

    }

    @Test
    void dodajObavezniPredmet() {
        PlanStudija p = new PlanStudija("RI", null, null);
        p.dodajObavezniPredmet(new Predmet("SP", "Samir Ribic"));
        assertEquals("1. SP\n", p.vratiSpisakObaveznihPredmeta());
    }

    @Test
    void dodajIzborniPredmet() {
        PlanStudija p = new PlanStudija("RI", null, null);
        p.dodajIzborniPredmet(new Predmet("NA", "Zeljko Juric"));
        assertEquals("1. NA\n", p.vratiSpisakIzbornihPredmeta());
    }

    @Test
    void ukloniObavezniPredmet() {
        PlanStudija p = new PlanStudija("RI", null, null);
        var predmet = new Predmet("SP", "Samir Ribic");
        p.dodajObavezniPredmet(predmet);
        p.ukloniObavezniPredmet(predmet);
        assertEquals("", p.vratiSpisakObaveznihPredmeta());
    }

    @Test
    void ukloniIzborniPredmet() {
        PlanStudija p = new PlanStudija("RI", null, null);
        var predmet = new Predmet("NA", "Zeljko Juric");
        p.dodajIzborniPredmet(predmet);
        p.ukloniIzborniPredmet(predmet);
        assertEquals("", p.vratiSpisakIzbornihPredmeta());
    }
}