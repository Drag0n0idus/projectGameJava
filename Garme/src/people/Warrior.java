/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author Richard Míček
 */
public class Warrior extends Human {
    private int str = 3;
    private int dxt = -2;
    private int intel = 1;
    private int con = 2;
    private String specialization = "WARRIOR";

    public Warrior(String jmeno) {
        super(jmeno);
        this.setStrength(super.getStrength() + str);
        this.setDexterity(super.getDexterity() + dxt);
        this.setIntelligence(super.getIntelligence() + intel);
        this.setConstitution(super.getConstitution() + con);
    }

    public String getSpecialization() {
        return specialization;
    }   
}
