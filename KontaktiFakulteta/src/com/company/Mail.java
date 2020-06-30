package com.company;

public class Mail extends Kontakt{

    public Mail(){
    }

    public Mail(String vrednostKontakta, String tipKontakta) {
        super(vrednostKontakta, tipKontakta);
    }

    public Mail(String vrednostKontakta) {
        super(vrednostKontakta,"e-mail");
    }

    @Override
    public void setTipKontakta(String tipKontakta) {
        super.setTipKontakta("e-mail");
    }

    @Override
    public boolean isValidan(String vrednostKontakta) {
        if (vrednostKontakta.contains("@") && vrednostKontakta.contains(".")) {
            return true;
        } else {
            return false;
        }
    }
}
