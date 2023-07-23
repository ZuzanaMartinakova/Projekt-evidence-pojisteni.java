package cz.itnetwork;

/**
 *
 * @author Zuzana Martináková
 */

// třída Pojistenec, která obsahuje jméno, příjmení, věk a telefonní číslo pojištěného.

public class Pojistenec {

    // atributy třídy
    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefonniCislo;

    // vytvoření konstruktoru s parametry jmeno, prijmeni,... this inicializuje parametry, které jsou přiřazeny k atributům třídy jmeno, prijmeni, ...
    public Pojistenec(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }

    // metody k navrácení hodnoty, gettery, metoda getJmeno slouží k získání hodnot atributů
    public String getJmeno() {

        return jmeno;
    }
    public String getPrijmeni() {

        return prijmeni;
    }
    public int getVek() {

        return vek;
    }
    public String getTelefonniCislo() {

        return telefonniCislo;
    }

    // toString() pro jejich výpis
    @Override
    public String toString() {
        return jmeno + " " + prijmeni + ", " + vek + " let, tel: " + telefonniCislo;
    }


}
