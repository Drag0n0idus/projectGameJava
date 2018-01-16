/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author František
 */
public class Slime extends Enemy{
    public Slime(int lvl, int hp){
        this.setDmg((int)Math.floor(lvl / 0.5));
        this.setHealth(hp);
        this.setName("Slime");
    }
}
