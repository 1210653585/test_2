/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_02.Classes;

/**
 *
 * @author 1210653585
 */
public class Auto extends Fahrzeug implements Comparable<Auto> {

    private boolean Klimaanlage;
    private short Airbags;

    public boolean isKlimaanlage() {
        return Klimaanlage;
    }

    public void setKlimaanlage(boolean Klimaanlage) {
        this.Klimaanlage = Klimaanlage;
    }

    public short getAirbags() {
        return Airbags;
    }

    public void setAirbags(short Airbags) {
        this.Airbags = Airbags;
    }

    void KlimaanlageAn() {
        if (Klimaanlage == false) {
            Klimaanlage = true;
        } else {
            System.out.println("Klimaanlage läuft");
        }
    }

    void KlimaanlageAus() {
        if (Klimaanlage == true) {
            Klimaanlage = false;
        } else {
            System.out.println("Klimaanlage ist schon aus");
        }
    }

    public Auto(short Reifen, Farbe colour, short PS, short Tueren, short Airbags) {
        super(Reifen, colour, PS, Tueren);
        this.Klimaanlage = false;
        this.Airbags = Airbags;
        this.colour = Farbe.blue;
    }

    @Override
    public String toString() {
        return "Mein Auto hat " + getPS() + " PS und fährt mit " + getGeschwindigkeit() + "km/h";
    }

    @Override
    public int compareTo(Auto Auto_2) {

        if (this.getPS() < Auto_2.getPS()) {
            return 1;
        } else if (this.getPS() == Auto_2.getPS()) {
            return 0;
        } else {
            return -1;
        }
    }
}
