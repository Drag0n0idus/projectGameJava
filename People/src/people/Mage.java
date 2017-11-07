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
public class Mage extends Human {
    private int str = 2;
    private int dxt = 1;
    private int intel = 3;
    private String specialization = "MAGE";

    public Mage(String jmeno) {
        super(jmeno);
        this.setStrength(super.getStrength() - str);
        this.setDexterity(super.getDexterity() + dxt);
        this.setIntelligence(super.getIntelligence() + intel);
    }

    public String getSpecialization() {
        return specialization;
    }   
}
