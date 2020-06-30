package com.company;

public class Adresa extends Kontakt {

    public Adresa() {
        super();
    }

    public Adresa(String vrednostKontakta) {
        super(vrednostKontakta);
    }

    @Override
    public boolean isValidan(String vrednostKontakta) {
        if(vrednostKontakta.contains("")){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void setTipKontakta(String tipKontakta) {
        super.setTipKontakta("Adresa");
    }
}
