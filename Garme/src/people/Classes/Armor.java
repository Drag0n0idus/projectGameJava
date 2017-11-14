/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author Drag0n0idus
 */
public class Armor {
    public enum Type {
        CHEST, HELMET, SHOES
    }
    private String name;
    private int armor;
    private Type type;
    
    public Armor(Type type){
        switch(type){
            case CHEST:
                this.setName("Banged up brestplate");
                this.setArmor(5);
                break;
            case HELMET:
                this.setName("Old bucket");
                this.setArmor(3);
                break;
            case SHOES:
                this.setName("Linen wraps");
                this.setArmor(1);
                break;
        }
        this.setType(type);
    }

    public Armor(String name, int armor, Type type){
        this.setName(name);
        this.setArmor(armor);
        this.setType(type);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    
    
}
