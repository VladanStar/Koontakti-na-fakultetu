package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Zaposleni z = new Zaposleni("Mika ", "Mikic",1,"docent");
        List<Kontakt> lista = new ArrayList<>();
        lista.add(new Mail("mikamikic@gmail.com"));
        lista.add(new BrojTelefona("064/3081165"));
        z.setKontaktiOsobe(lista);

        List<Kontakt> listaStud = new ArrayList<>();
        Mail m = new Mail("arsa.arsic@gmail.com");
        listaStud.add(m);
        BrojTelefona brT1 = new BrojTelefona();
        brT1.setVrednostKontakta("060/1531174");
        listaStud.add(brT1);
        listaStud.add(new Adresa("Kopaonicka 48"));


        Student s = new Student("Vladimir","Vejzovic",listaStud,2345);
        System.out.println();
        z.printKontakteOsobe();
        System.out.println();
        s.printKontakteOsobe();
    }
}
