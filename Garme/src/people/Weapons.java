/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author Richard
 */
public class Weapons {
    public enum Type {
        SWORD, BOW, WAND
    }
    private String name;
    private int damage;
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
        this.setDamage(2);
        this.setType(type);
    }
    
    public Weapons(String name, int damage, Type type) {
        this.name = name;
        this.damage = damage;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    
    
    
}
