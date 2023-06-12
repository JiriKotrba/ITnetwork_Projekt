/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.projekt;

/**
 *
 * @author pnpra
 */
public class Pojisteny {

    private String jmeno;
    private String prijmeni;
    private int vek;
    private int telCislo;

    /**
     *
     * @param jmeno
     * @param prijmeni
     * @param vek
     * @param telCislo
     */
    public Pojisteny(String jmeno, String prijmeni, int vek, int telCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telCislo = telCislo;
    }

    /**
     * @return the jmeno
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * @return the prijmeni
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * @return the vek
     */
    public int getVek() {
        return vek;
    }

    /**
     * @return the telCislo
     */
    public int getTelCislo() {
        return telCislo;
    }

    @Override
    public String toString() {
        return String.format("%s\t%s\t%s\t%s", jmeno, prijmeni, vek, telCislo);
    }

}
