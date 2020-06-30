package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class Osoba {
    private String ime;
    private String prezime;
    List<Kontakt> kontaktiOsobe;

    public Osoba() {
    }

    public Osoba(String ime, String prezime, List<Kontakt> kontaktiOsobe) {
        this.ime = ime;
        this.prezime = prezime;
        this.kontaktiOsobe = kontaktiOsobe;
    }

    public Osoba(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public List<Kontakt> getKontaktiOsobe() {
        return kontaktiOsobe;
    }

    public void setKontaktiOsobe(List<Kontakt> kontaktiOsobe) {
        if(kontaktiOsobe == null){
            this.kontaktiOsobe = new ArrayList<>();
        }
        else{
            this.kontaktiOsobe = kontaktiOsobe;
        }
    }
    @Override
    public String toString() {
        return "Osoba{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }
    public void addKontakt(Kontakt kontakt){
        if(this.kontaktiOsobe == null){
            this.kontaktiOsobe = new ArrayList<>();
        }
        this.kontaktiOsobe.add(kontakt);
    }
    public void printKontakteOsobe(){
        System.out.println(this.toString());
        for(Kontakt k: kontaktiOsobe){
            System.out.println(k.toString());
        }

    }
}
