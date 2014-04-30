/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_02.Classes;

/**
 *
 * @author 1210653585
 */
public class Mensch extends Säugetier {

    public Mensch(String Name, int Alter, char Geschlecht) {
        super(Name, Alter, Geschlecht);
    }

    public String printAll() {
        return Name + " # " + Alter + " # " + Geschlecht;
    }

    public static void main(String[] args) {
        Mensch Mensch1 = new Mensch("Franz", 20, 'm');
        System.out.println(Mensch1.printAll());
    }
}
