/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_02.Classes;

/**
 *
 * @author 1210653585
 */
public class Student extends Mensch_2{
    
    String Matrikelnummer;
    String Studiengang;

    public Student(String Matrikelnummer, String Studiengang, String Vorname, String Nachname, int Alter) {
        super(Vorname, Nachname, Alter);
        this.Matrikelnummer = Matrikelnummer;
        this.Studiengang = Studiengang;
    }

    @Override
    void Status(){
        System.out.println("Es handelt sich um einen Student "+Vorname+" "+Nachname+", mit dem Alter " +Alter+", dem Studiengang "+Studiengang+" und der Matrikelnummer "+Matrikelnummer);
    }
    
    public static void main(String[] args)
    {
    Mensch_2 Mensch_3 = new Mensch_2("Klaus", "Kleber", 20);
    Mensch_3.Status();
    
    Mensch_3 = new Student("007","Secret Operations","Klaus", "Kleber", 20);
    Mensch_3.Status();
    }
}
