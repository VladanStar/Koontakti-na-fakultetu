package com.company;

public class BrojTelefona extends Kontakt{

    public BrojTelefona(String vrednostKontakta) {
        super(vrednostKontakta,"Broj telefona");
    }

    public BrojTelefona(String vrednostKontakta, String tipKontakta) {
        super(vrednostKontakta, tipKontakta);
    }

    public BrojTelefona() {

    }

    @Override
    public void setTipKontakta(String tipKontakta) {
        super.setTipKontakta("Broj telefona");
    }

    @Override
    public boolean isValidan(String vrednostKontakta) {
        if (vrednostKontakta.contains("/") && vrednostKontakta.contains("-")) {
            return true;
        }
        else{
            return false;
        }
    }
}
