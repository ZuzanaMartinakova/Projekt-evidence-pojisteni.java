package cz.itnetwork;

/**
 *
 * @author Zuzana Martináková
 */

// třída Pojisteni, která obsahuje seznam pojištěných osob a metody pro přidání nového pojištěného,
// vypsání všech pojištěných a vyhledání pojištěného.

import java.util.ArrayList;
import java.util.Scanner;

public class Pojisteni {

    // entity jsou uložené v ArrayListu seznamPojistenych
    ArrayList<Pojistenec> seznamPojistenych = new ArrayList<Pojistenec>(); // řádek kódu definuje třídu Pojistenec a vytváří seznam pojistěných jako ArrayList instancí třídy Pojistenec.

    // kód pro přidání nového pojištěného

    public void pridejPojisteneho() {
        Scanner scanner = new Scanner(System.in,"Windows-1250");
        System.out.println("Zadejte jméno pojištěného:");
        String jmeno = scanner.nextLine();
        System.out.println("Zadejte příjmení:");
        String prijmeni = scanner.nextLine();
        System.out.println("Zdejte věk:");
        int vek = Integer.parseInt(scanner.nextLine());
        System.out.println("Zadejte telefonní číslo:");
        String telefonniCislo = scanner.nextLine();
        seznamPojistenych.add(new Pojistenec(jmeno, prijmeni, vek, telefonniCislo)); // přidání nové instance třídy Pojistenec s parametry jmeno, prijmeni, ... do seznamu pojištěných.

    }
    // kód pro vypsání všech pojištěných, pomocí cyklu foreach
    public void vypisPojistene() {
        for (Pojistenec pojistenec : seznamPojistenych) {
            System.out.println(pojistenec);
        }

    }
    // kód pro vyhledání pojištěného
    public void najdiPojisteneho() {
        Scanner scanner = new Scanner(System.in,"Windows-1250");
        System.out.println("Zadejte jméno hledaného pojištěného:");
        String hledaneJmeno = scanner.nextLine();
        System.out.println("Zadejte příjmení hledaného pojištěného:");
        String hledanePrijmeni = scanner.nextLine();
        boolean osobaNalezena = false;

        for (Pojistenec osoba : seznamPojistenych) {
            if (osoba.getJmeno().startsWith(hledaneJmeno) && osoba.getPrijmeni().startsWith(hledanePrijmeni)) {
                System.out.println(osoba);
                osobaNalezena = true;
            }
        }
        if (!osobaNalezena) {
            System.out.println("Osoba s těmito údaji nebyla nalezena.");
        }

    }
}
