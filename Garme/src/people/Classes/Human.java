/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 * Třída Human
 * @author Richard Míček (borrowed)
 */
public class Human {
    /* Vlastní výčtový typ */
    public enum Sex {
        MAN, WOMAN
    }
    /* Atributy třídy */
    private String name;
    private int strength = 10;
    private int dexterity = 10;
    private int intelligence = 10;
    private int constitution = 0;
    private Sex sex = Sex.MAN;
    private Weapons weapon;
    private Armor chest = new Armor(Armor.Type.CHEST);
    private Armor helmet = new Armor(Armor.Type.HELMET);
    private Armor shoes = new Armor(Armor.Type.SHOES);

    public Human(String name){
        this.setName(name);
        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }
    
    public String getStrengthS() {
        return Integer.toString(this.getStrength());
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }
    
    public String getDexterityS() {
        return Integer.toString(this.getDexterity());
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }
    
    public String getIntelligenceS() {
        return Integer.toString(this.getIntelligence());
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getConstitution() {
        return constitution;
    }
    
    public String getConstitutionS() {
        return Integer.toString(this.getConstitution());
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public Sex getSex() {
        return sex;
    }
   
    public void setSex(Sex sex) {
        this.sex = sex;
    }
    
    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public Armor getChest() {
        return chest;
    }

    public void setChest(Armor chest) {
        this.chest = chest;
    }

    public Armor getHelmet() {
        return helmet;
    }

    public void setHelmet(Armor helmet) {
        this.helmet = helmet;
    }

    public Armor getShoes() {
        return shoes;
    }

    public void setShoes(Armor shoes) {
        this.shoes = shoes;
    }
    
    
}