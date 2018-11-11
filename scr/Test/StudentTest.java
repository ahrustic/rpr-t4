package Test;

import ba.unsa.etf.rpr.tutorijal4.Student;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @org.junit.jupiter.api.Test
    void getEcts() {
        Student s = new Student("Amila", "Hrustić", 12345, 0);
        assertEquals(0, s.getEcts());
    }


    @org.junit.jupiter.api.Test
    void getIme() {
        Student s = new Student("Amila", "Hrustić", 12345, 0);
        assertEquals("Amila", s.getIme());
    }

    @org.junit.jupiter.api.Test
    void getPrezime() {
        Student s = new Student("Amila", "Hrustić", 12345, 0);
        assertEquals("Hrustić", s.getPrezime());
    }

    @org.junit.jupiter.api.Test
    void getBrojIndexa() {
        Student s = new Student("Amila", "Hrustić", 12345, 0);
        assertEquals(12345, s.getBrojIndexa());
    }

}