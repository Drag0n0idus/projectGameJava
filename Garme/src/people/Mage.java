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
    private int str = -2;
    private int dxt = 1;
    private int intel = 3;
    private int cons = 0;
    private String specialization = "MAGE";
    private Weapons weapon = new Weapons(Weapons.Type.WAND);

    public Mage(String jmeno) {
        super(jmeno);
        this.setStrength(super.getStrength() + str);
        this.setDexterity(super.getDexterity() + dxt);
        this.setIntelligence(super.getIntelligence() + intel);  
        this.setConstitution(super.getConstitution() + cons);
        this.setHealth(super.getHealth() * (this.getConstitution()/10));
        this.setWeapon(weapon);
    }

    public String getSpecialization() {
        return specialization;
    } 

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDxt() {
        return dxt;
    }

    public void setDxt(int dxt) {
        this.dxt = dxt;
    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    @Override
    public String toString(){
        String output = this.getName() + " [" + this.getClass().getSimpleName() + "]";
        return output;
    }
}
