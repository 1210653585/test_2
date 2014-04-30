/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_02.Classes;

/**
 *
 * @author 1210653585
 */
public class Wasserfahrzeug extends Fahrzeug {

    private double Tiefgang;
    private short Schrauben;
    private double Ladung;

    public Wasserfahrzeug(Short Reifen, Farbe colour, short PS, short Tueren, double Tiefgang, short Schrauben, double Ladung) {
        super(Reifen, colour, PS, Tueren);
        this.Tiefgang = Tiefgang;
        this.Schrauben = Schrauben;
        this.Ladung = Ladung;

    }

    public double getTiefgang() {
        return Tiefgang;
    }

    public void setTiefgang(double Tiefgang) {
        this.Tiefgang = Tiefgang;
    }

    public short getSchrauben() {
        return Schrauben;
    }

    public void setSchrauben(short Schrauben) {
        this.Schrauben = Schrauben;
    }

    public double getLadung() {
        return Ladung;
    }

    public void setLadung(double Ladung) {
        this.Ladung = Ladung;
    }

    void entladen() throws InterruptedException {
        Ladung = 0;
        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return "Mein Wasserfahrzeug hat " + getPS() + " PS und einen Tiefgang von " + this.Tiefgang + " m";
    }
}
