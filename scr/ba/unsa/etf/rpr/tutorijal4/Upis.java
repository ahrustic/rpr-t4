package ba.unsa.etf.rpr.tutorijal4;

import java.util.List;

public class Upis {

        private Predmet predmet;
        private PlanStudija planStudija;
        private Student student;

    public Upis(Predmet predmet, Student student, PlanStudija planStudija) {
            this.predmet = predmet;
            this.student = student;
            this.planStudija = planStudija;
    }

    public Student getStudent() {
        return student;
    }

    public PlanStudija getPlanStudija() {
        return planStudija;
    }

    public Predmet getPredmeti() {
        return predmet;
    }
}
