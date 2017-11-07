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
 * @author ucitel
 */
public class People {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human student = new Human("Hugo", 18, Human.Sex.MAN);
        student.setWeight(72); 

        Human studentka = new Human("Hilda", 17, Human.Sex.WOMAN);
        studentka.setWeight(55); 
        studentka.setHeight(1.75f); 

        Human sportovec = new Hockeyplayer("Jarda",20000);
        sportovec.setAge(45);
        sportovec.setHeight(189);
        sportovec.setWeight(102);
        ((Hockeyplayer) sportovec).setGoals(10);

        List<Human> lide = new ArrayList<Human>(); 
        lide.add(sportovec);
        lide.add(student);
        lide.add(studentka);
        
        for(Human clovek : lide) {
            System.out.println(clovek.toString());
        }
    }
    
}
