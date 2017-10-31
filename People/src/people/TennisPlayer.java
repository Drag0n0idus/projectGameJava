/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author student
 */
public class TennisPlayer extends Sportsman {
    int wins = 0;
    int loss = 0;
    double winRate = 0;
    
    public TennisPlayer(String jmeno) {
        super(jmeno);
    }
    
    public TennisPlayer(String jmeno, int energy, int wins, int loss, double winRate) {
        super(jmeno, energy);
        this.wins = wins;
        this.loss = loss;
        this.winRate = winRate;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoss() {
        return loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    public double getWinRate() {
        return winRate;
    }

    public void setWinRate(double performance) {
        this.winRate = performance;
    }

    @Override
    public String toString() {
        return super.toString() + "[Tennis]";
    }
    
    
}
