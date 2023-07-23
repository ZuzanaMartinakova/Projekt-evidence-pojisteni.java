package cz.itnetwork;

import java.util.Scanner;

/**
 *
 * @author Zuzana Martináková
 */

public class EvidencePojisteni {
    public static void main(String[] args) {

        // Nadpis
        System.out.println("----------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("----------------------");

        Pojisteni pojisteni = new Pojisteni(); // kód vytváří novou instanci třídy Pojisteni a uloží ji do proměnné pojisteni
        Scanner scanner = new Scanner(System.in,"Windows-1250");
        // hlavní cyklus
        while (true) {
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");
            int volba = Integer.parseInt(scanner.nextLine());

            // reakce na volbu
            switch (volba) {
                case 1:
                    pojisteni.pridejPojisteneho();
                    System.out.println("Data byla uložena. Pokračujte libovolnou klávesou...");
                    break;
                case 2:
                    pojisteni.vypisPojistene();
                    System.out.println("Pokračujte libovolnou klávesou...");
                    break;
                case 3:
                    pojisteni.najdiPojisteneho();
                    System.out.println("Pokračujte libovolnou klávesou...");
                    break;
                case 4:
                    System.out.println("Ukončení programu.");
                    break;
                default:
                    System.out.println("Neplatná volba, opakujte prosím svou volbu.");
                    break;
             }
        }

    }
}
