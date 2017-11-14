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
    private Weapons weapon = new Weapons(Weapons.Type.BOW);

    public Ranger(String jmeno) {
        super(jmeno);
        this.setStrength(super.getStrength() + str);
        this.setDexterity(super.getDexterity() + dxt);
        this.setIntelligence(super.getIntelligence() + intel);
        this.setConstitution(super.getConstitution() + con);
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

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }
       
    @Override
    public String toString(){
        String output = this.getName() + " [" + this.getClass().getSimpleName() + "]";
        return output;
    }
}
