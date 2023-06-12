/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.projekt;

import java.util.ArrayList;

/**
 *
 * @author pnpra
 */
/*
Třída Databaze slouží pouze pro manipulaci s daty.
Obsahuje vnitřní kolekci pojisteni, ta se inicializuje v
konstruktoru.
 */
public class Databaze {

    private ArrayList<Pojisteny> pojisteni;

    public Databaze() {
        pojisteni = new ArrayList<>();
    }
    
    
    public void pridejPojisteneho(String jmeno, String prijmeni, int vek, int telCislo){
        getPojisteni().add(new Pojisteny (jmeno, prijmeni, vek, telCislo));
    }

    /**
     * @return the pojisteni
     */
    public ArrayList<Pojisteny> getPojisteni() {
        return pojisteni;
    }
    
    

}
