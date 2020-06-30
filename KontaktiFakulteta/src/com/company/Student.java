package com.company;

import java.util.List;

public class Student extends Osoba{
    private int indeks;

    public Student() {
    }

    public Student(int indeks) {
        this.indeks = indeks;
    }

    public Student(String ime, String prezime, List<Kontakt> kontaktiOsobe, int indeks) {
        super(ime, prezime, kontaktiOsobe);
        this.indeks = indeks;
    }

    public Student(String ime, String prezime, int indeks) {
        super(ime, prezime);
        this.indeks = indeks;
    }

    @Override
    public String toString() {
        return "Ime: " + super.getIme() + " prezime " + super.getPrezime() + " broj indeksa " + this.indeks;

    }
}
