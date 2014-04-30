/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_02.Classes;

/**
 *
 * @author 1210653585
 */
public class Mensch_2 {
    
    String Vorname;
    String Nachname;
    int Alter;

    public Mensch_2(String Vorname, String Nachname, int Alter) {
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.Alter = Alter;
    }
    
    void Status(){
        System.out.println("Es handelt sich um Mensch "+Vorname+" "+Nachname+" mit dem Alter " +Alter);
    }
    
}
