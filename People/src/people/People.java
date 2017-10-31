/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class People {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human student = new Human("Hugo", 59, Human.Sex.MAN);
        student.setWeight(72);
        //System.out.println(student.toString());
        Human studentka = new Human("Hildegarda", 18, Human.Sex.WOMAN);
        studentka.setWeight(38);
        studentka.setHeight(1.52f);
        //System.out.println(studentka.toString());
        Human tenista = new TennisPlayer("Roger", 30000, 93, 49, 0.65f);
        tenista.setAge(36);
        tenista.setWeight(85);
        tenista.setHeight(1.85f);
        //System.out.println(tenista.toString());
        
        List<Human> lide = new ArrayList<Human>();
        lide.add(student);
        lide.add(studentka);
        lide.add(tenista);
        
        for(Human clovek : lide) {
            System.out.println(clovek.toString());
        }
    }
    
}
