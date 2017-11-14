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
public class Weapons {
    public enum Type {
        SWORD, BOW, WAND
    }
    private String name;
    private int damageMin;
    private int damageMax;
    private Type type;
    
    public Weapons(Type type){
        switch(type){
            case SWORD:
                this.setName("Rusty sword");
                break;
            case WAND:
                this.setName("Broken wand");
                break;
            case BOW:
                this.setName("Old bow");
                break;
        }
        this.setDamage(3, 5);
        this.setType(type);
    }
    
    public Weapons(String name, int damageMin, int damageMax, Type type) {
        this.name = name;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamageMin() {
        return damageMin;
    }
    
    public int getDamageMax() {
        return damageMax;
    }

    public void setDamage(int damageMin, int damageMax) {
        this.damageMin = damageMin;
        this.damageMax = damageMax;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    
    
    
}
