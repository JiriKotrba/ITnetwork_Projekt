/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cz.itnetwork.projekt;

import java.util.Scanner;

/**
 *
 * @author pnpra
 */
public class Projekt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        Evidence evidence = new Evidence();
        String volba = "";

// hlavní cyklus
        while (!volba.equals("4")) {
            evidence.vypisMenu();
            volba = sc.nextLine().trim();
            System.out.println();
            // reakce na volbu
            switch (volba) {
                case "1":
                    // Přidá záznam
                    evidence.pridejZaznam();
                    break;
                case "2":
                    // Vypíše všechny objekty v kolekci
                    System.out.println(evidence.toString());
                    evidence.cekej();
                    break;
                case "3":
                    // Vyhledá v kolekci podle jmena a prijmeni
                    evidence.vyhledej();
                    break;
                case "4":
                    // vyskočí z cyklu while a tím ukončí program
                    evidence.cekej();
                    break;
                default:
                    System.out.println("Neplatná volba, stiskněte klávesu Enter a opakujte volbu.");
                    evidence.cekej();
                    break;
            }
        }
    }
}
