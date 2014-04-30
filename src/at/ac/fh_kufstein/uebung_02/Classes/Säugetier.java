/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_02.Classes;

/**
 *
 * @author 1210653585
 */
public abstract class Säugetier {

    String Name;
    int Alter;
    char Geschlecht;

    public Säugetier(String Name, int Alter, char Geschlecht) {
        this.Name = Name;
        this.Alter = Alter;
        this.Geschlecht = Geschlecht;
    }
    
    public abstract String printAll();
}
