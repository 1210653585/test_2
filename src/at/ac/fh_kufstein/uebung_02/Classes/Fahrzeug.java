/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_02.Classes;

/**
 *
 * @author 1210653585
 */
public class Fahrzeug {

    private short Reifen;
    public enum Farbe {silver, red, black, blue, white};
    Farbe colour;
    private short PS;
    private short Tueren;
    private boolean Gestartet;
    private short Geschwindigkeit;
    public static int Anzahl;

    public Fahrzeug(Short Reifen, Farbe colour, short PS, short Tueren) {
        this.Reifen = Reifen;
        this.colour = colour;
        this.PS = PS;
        this.Tueren = Tueren;
        this.Gestartet = false;
        this.Geschwindigkeit = 0;
        Anzahl = Anzahl + 1;
    }

    public short getReifen() {
        return Reifen;
    }

    public void setReifen(short Reifen) {
        this.Reifen = Reifen;
    }

    public short getPS() {
        return PS;
    }

    public void setPS(short PS) {
        this.PS = PS;
    }

    public short getTueren() {
        return Tueren;
    }

    public void setTueren(short Tueren) {
        this.Tueren = Tueren;
    }

    public boolean isGestartet() {
        return Gestartet;
    }

    public void setGestartet(boolean Gestartet) {
        this.Gestartet = Gestartet;
    }

    public short getGeschwindigkeit() {
        return Geschwindigkeit;
    }

    public void setGeschwindigkeit(short Geschwindigkeit) {
        this.Geschwindigkeit = Geschwindigkeit;
    }

    public static int getAnzahl() {
        return Anzahl;
    }

    public static void setAnzahl(int Anzahl) {
        Fahrzeug.Anzahl = Anzahl;
    }

    public Farbe getColour() {
        return colour;
    }

    public void setColour(Farbe colour) {
        this.colour = colour;
    }

    void starten() {
        Gestartet = true;
    }

    void stoppen() {
        Gestartet = false;
    }

    void beschleunigen(short geschwindigkeit) {
        if (Gestartet = true && Geschwindigkeit < 250) {
            Geschwindigkeit += geschwindigkeit;
        } else {
            System.out.println("Fahrzeug kann nicht beschleunigen");
        }
    }

    void bremsen(short geschwindigkeit) {
        if (Gestartet = true && Geschwindigkeit > 0) {
            Geschwindigkeit -= geschwindigkeit;
        } else {
            System.out.println("Das Fahrzeug ist nicht gestartet");
        }
    }
}
