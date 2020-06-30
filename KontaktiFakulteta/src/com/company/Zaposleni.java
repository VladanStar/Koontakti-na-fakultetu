package com.company;

import java.util.List;

public class Zaposleni extends Osoba{
    private int idZaposlenog;
    private String pozicija;

    public Zaposleni() {
    }

    public Zaposleni(int idZaposlenog, String pozicija) {
        this.idZaposlenog = idZaposlenog;
        this.pozicija = pozicija;
    }

    public Zaposleni(String ime, String prezime, List<Kontakt> kontaktiOsobe, int idZaposlenog, String pozicija) {
        super(ime, prezime, kontaktiOsobe);
        this.idZaposlenog = idZaposlenog;
        this.pozicija = pozicija;
    }

    public Zaposleni(String ime, String prezime, int idZaposlenog, String pozicija) {
        super(ime, prezime);
        this.idZaposlenog = idZaposlenog;
        this.pozicija = pozicija;
    }

    public int getIdZaposlenog() {
        return idZaposlenog;
    }

    public void setIdZaposlenog(int idZaposlenog) {
        this.idZaposlenog = idZaposlenog;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    @Override
    public String toString() {
        return "Zaposleni{" + "  ime " + super.getIme() + " prezime " + super.getPrezime()+
                "idZaposlenog=" + idZaposlenog +
                ", pozicija='" + pozicija + '\'' +
                '}';
    }
}
