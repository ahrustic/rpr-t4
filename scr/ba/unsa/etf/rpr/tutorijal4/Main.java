package ba.unsa.etf.rpr.tutorijal4;

import java.util.Set;

public class Main {

    private Set<Predmet> spisakPredmeta;
    private Set<Student> spisakStudenata;
    private Set<Upis> upisani;

    public Set<Predmet> getSpisakPredmeta() {
        return spisakPredmeta;
    }

    public void setSpisakPredmeta(Set<Predmet> spisakPredmeta) {
        this.spisakPredmeta = spisakPredmeta;
    }

    public Set<Student> getSpisakStudenata() {
        return spisakStudenata;
    }

    public void setSpisakStudenata(Set<Student> spisakStudenata) {
        this.spisakStudenata = spisakStudenata;
    }

    public Set<Upis> getUpisStudenta() {
        return upisani;
    }

    public void setUpisStudenta(Set<Upis> upisStudenta) {
        this.upisani = upisStudenta;
    }

    void upisi(Student student, Predmet predmet, PlanStudija planStudija) {
        upisani.add(new Upis(predmet, student, planStudija));
    }

}
