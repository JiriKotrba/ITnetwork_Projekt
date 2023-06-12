/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.projekt;

import java.util.Scanner;

/**
 *
 * @author pnpra
 */
public class Evidence {

    private Databaze databaze;
    Scanner sc = new Scanner(System.in, "Windows-1250");

    public Evidence() {
        databaze = new Databaze();
    }

    // Vytvoří instanci třídy Pojisteny a ulozi ji do kolekce
    public void pridejZaznam() {
        System.out.println("Zadejte jméno pojištěného:");
        String jmeno = sc.nextLine().trim();
        System.out.println("Zadejte příjmení:");
        String prijmeni = sc.nextLine().trim();
        getDatabaze().pridejPojisteneho(jmeno, prijmeni, naparsujInt("věk"), naparsujInt("telefonní číslo"));
        System.out.println("");
        System.out.println("Data byla uložena.");
        cekej();
    }

    // Metoda pro výpis hlavního menu
    public void vypisMenu() {
        System.out.println("-----------------------------");
        System.out.println("Evidence pojistenych");
        System.out.println("-----------------------------");
        System.out.println();
        System.out.println("Vyberte si akci:");
        System.out.println("1 - Přidat nového pojištěného");
        System.out.println("2 - Vypsat všechny pojištěné");
        System.out.println("3 - Vyhledat pojištěného");
        System.out.println("4 - Konec");
    }

    // Metoda pro vyhledani pojisteneho
    public void vyhledej() {
        // Vyžádání dat
        System.out.println("Zadejte jméno pojištěného:");
        String jmeno = sc.nextLine().trim().toLowerCase();
        System.out.println("Zadejte příjmení:");
        String prijmeni = sc.nextLine().trim().toLowerCase();
        System.out.println();
        System.out.println("Nalezeny tyto záznamy.");
        // Cyklus pro vyhledání záznamu
        for (Pojisteny pojisteny : getDatabaze().getPojisteni()) {
            if ((jmeno.equals(pojisteny.getJmeno().toLowerCase())) && prijmeni.equals(pojisteny.getPrijmeni().toLowerCase())) {
                System.out.println(pojisteny.toString());
            }
        }
        cekej();
    }

    // 
    /**
     * metoda pro uspesne naparsovani promenych int
     *
     * @param druh věk/telefonní číslo
     * @return vraci int
     */
    private int naparsujInt(String druh) {
        int cislo = 0;
        boolean jeSpravne = false;
        while (!jeSpravne) {

            try {
                System.out.printf("Zadejte %s:", druh);
                System.out.println("");
                cislo = Integer.parseInt(sc.nextLine().trim());
                jeSpravne = true; // Nastavení booleanu jeSpravne na true, které ukončí cyklus while
                return cislo;
            } catch (Exception e) {
                System.out.println(
                        "Zadaná hodnota nelze vložit do záznamu.");
            }
        }
        return cislo;
    }

    /**
     * Metoda pro výpis všech záznamů
     *
     * @return vrací všechny záznamy ve Stringu
     */
    @Override
    public String toString() {
        String vypis = "";
        for (Pojisteny pojisteny : getDatabaze().getPojisteni()) {
            vypis += (pojisteny.toString()) + "\n";
        }
        return vypis;
    }

    // Metoda pro pozastavení programu a vyčkání na klávesu Enter 
    public void cekej() {
        System.out.println("Pokračujte klávesou Enter..");
        String bullshit = sc.nextLine();// Proměnná slouží pouze pro pozastavení programu pro větší přehlednost
        // lepší způsob v Javě neznám. V C# bych použil Console.ReadKey. 
    }

    /**
     * @return the databaze
     */
    public Databaze getDatabaze() {
        return databaze;
    }
}
