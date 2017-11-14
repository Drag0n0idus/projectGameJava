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
public class Ranger extends Human {
    private int str = 1;
    private int dxt = 3;
    private int intel = -2;
    private int con = 1;
    private String specialization = "RANGER";

    public Ranger(String jmeno) {
        super(jmeno);
        this.setStrength(super.getStrength() + str);
        this.setDexterity(super.getDexterity() + dxt);
        this.setIntelligence(super.getIntelligence() + intel);
        this.setConstitution(super.getConstitution() + con);
    }

    public String getSpecialization() {
        return specialization;
    } 
    
    @Override
    public String toString(){
        String output = this.getName() + " " + this.getClass().getSimpleName();
        return output;
    }
}
