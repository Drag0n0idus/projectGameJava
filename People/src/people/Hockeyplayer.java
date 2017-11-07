/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author ucitel
 */
public class Hockeyplayer extends Sportsman {
    public enum Post {
        GOALKEEPER, DEFENDER, FORWARD
    }
    private Post post;
    private int goals;
    private int assists;
    
    public Hockeyplayer(String jmeno, int energy) {
        super(jmeno, energy);
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    @Override
    public String toString() {
        return super.toString() + "Hockeyplayer{" + "post=" + post + ", goals=" + goals + ", assists=" + assists + '}';
    }        
    
}
