/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_01;

import at.ac.fh_kufstein.uebung_02.Classes.Auto;
import at.ac.fh_kufstein.uebung_02.Classes.Fahrzeug.Farbe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author 1210653585
 */
public class Aufruf {

    public static void main(String[] args) {

        Auto bmw = new Auto((short) 4, Farbe.silver, (short) 360, (short) 5, (short) 4);
        Auto audi = new Auto((short) 4, Farbe.black, (short) 310, (short) 5, (short) 8);
        Auto honda = new Auto((short) 4, Farbe.red, (short) 280, (short) 5, (short) 4);
        Auto vw = new Auto((short) 4, Farbe.blue, (short) 390, (short) 5, (short) 8);
        Auto lexus = new Auto((short) 4, Farbe.black, (short) 290, (short) 5, (short) 8);

        List<Auto> list_1 = new ArrayList<>();
        list_1.add(vw);
        list_1.add(honda);
        list_1.add(bmw);
        list_1.add(audi);
        list_1.add(lexus);

        Collections.sort(list_1);

        for (Auto eins : list_1) {
            System.out.println(eins.toString());
        }
    }
}
