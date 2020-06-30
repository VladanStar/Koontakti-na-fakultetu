package com.company;

public abstract class Kontakt {
    private String vrednostKontakta;
    private String tipKontakta;

    public Kontakt(String vrednostKontakta) {
    }

    public Kontakt(String vrednostKontakta, String tipKontakta) {
        this.vrednostKontakta = vrednostKontakta;
        this.tipKontakta = tipKontakta;
    }

    public Kontakt() {

    }

    public String getVrednostKontakta() {
        return vrednostKontakta;
    }

    public void setVrednostKontakta(String vrednostKontakta) {
        if (isValidan(vrednostKontakta)) {
            this.vrednostKontakta = vrednostKontakta;
        } else {
            System.out.println("Greska prilikom unosa vrednosti kontakta");
        }
    }

    public String getTipKontakta() {
        return tipKontakta;
    }

    public void setTipKontakta(String tipKontakta) {
        this.tipKontakta = tipKontakta;
    }

    public abstract boolean isValidan(String vrednostKontakta);

    @Override
    public String toString() {
        return "Kontakt{" +
                "tipKontakta='" + tipKontakta + '\'' +
                '}';
    }
}
