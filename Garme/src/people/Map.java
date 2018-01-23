/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class PlayerModel {
    public static final int BLOCK_SIZE = 31;
    private int a;
    public int x;
    public int y;
    public int xP;
    public int yP;
    private Color color;

    public PlayerModel(Human person) {
        a = 15;
        color = new Color(255, 0, 0);
        x = person.getX();
        y = person.getY();
    }

    public void paintModel(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(this.color);
        g2.fillRect(this.x * BLOCK_SIZE + 8, this.y * BLOCK_SIZE + 8, this.a, this.a);
    }
}

public class Map extends JPanel implements KeyListener {
    Human character;
    PlayerModel p;
    public int[][] colorLayout = new int[][]{
        {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 5, 5, 0, 0, 0, 0, 0, 0},
        {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 5, 5, 0, 0, 0, 0, 0, 0},
        {2, 2, 2, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0, 0, 0, 0},
        {2, 2, 2, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0, 0, 0, 0},
        {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0, 0, 0, 0},
        {5, 5, 0, 5, 5, 5, 5, 1, 1, 1, 1, 1, 1, 1, 5, 5, 0, 0, 0, 5},
        {5, 5, 5, 5, 5, 1, 1, 1, 2, 2, 3, 3, 3, 1, 5, 5, 5, 5, 5, 5},
        {5, 5, 5, 5, 5, 1, 2, 2, 2, 3, 3, 3, 3, 1, 5, 5, 5, 5, 5, 2},
        {5, 5, 5, 5, 5, 1, 2, 2, 3, 3, 3, 3, 3, 1, 5, 5, 5, 2, 2, 2},
        {5, 5, 5, 5, 5, 1, 5, 5, 5, 5, 2, 2, 3, 1, 5, 5, 2, 2, 2, 2},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 2, 2, 5, 1, 5, 5, 2, 2, 2, 2},
        {2, 2, 5, 5, 5, 5, 5, 5, 1, 5, 5, 5, 5, 1, 5, 5, 5, 5, 2, 2},
        {2, 2, 2, 2, 2, 5, 5, 5, 1, 1, 1, 1, 1, 1, 5, 5, 5, 5, 2, 2},
        {4, 4, 4, 4, 2, 2, 2, 5, 5, 5, 5, 5, 5, 1, 5, 5, 5, 5, 5, 5},
        {4, 4, 4, 4, 2, 2, 2, 2, 5, 5, 5, 5, 5, 1, 1, 5, 5, 5, 5, 5},
        {4, 4, 4, 4, 4, 4, 2, 2, 5, 5, 5, 5, 5, 5, 1, 5, 5, 5, 5, 5},
        {4, 4, 4, 4, 4, 4, 2, 2, 2, 5, 5, 5, 5, 5, 1, 1, 1, 1, 1, 1},
        {4, 4, 4, 4, 4, 4, 4, 4, 2, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5},
        {4, 4, 4, 4, 4, 4, 4, 4, 2, 2, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5},
        {4, 4, 4, 4, 4, 4, 4, 4, 4, 2, 2, 2, 5, 5, 5, 5, 5, 5, 5, 5},};
    public static final Color DESERT = new Color(255, 255, 102);
    public static final Color DIRT_ROAD = new Color(153, 102, 51);
    public static final Color FOREST = new Color(0, 51, 0);
    public static final Color LAKE = new Color(0, 153, 204);
    public static final Color MOUNTAINS = new Color(128, 128, 128);
    public static final Color PLAINS = new Color(102, 204, 0);

    public Color[] terrain = new Color[]{
        DESERT,
        DIRT_ROAD,
        FOREST,
        LAKE,
        MOUNTAINS,
        PLAINS
    };

    public static final int NUM_ROWS = 20;
    public static final int NUM_COLS = 20;

    public static final int PREFERRED_GRID_SIZE_PIXELS = 31;

    // In reality you will probably want a class here to represent a map tile,
    // which will include things like dimensions, color, properties in the
    // game world.  Keeping simple just to illustrate.
    private Color[][] terrainGrid;

    public Map() {
        this.terrainGrid = new Color[NUM_ROWS][NUM_COLS];
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS; j++) {
                int index = this.colorLayout[j][i];
                this.terrainGrid[i][j] = this.terrain[index];
            }
        }
        int preferredWidth = NUM_COLS * PREFERRED_GRID_SIZE_PIXELS;
        int preferredHeight = NUM_ROWS * PREFERRED_GRID_SIZE_PIXELS;
        setPreferredSize(new Dimension(preferredWidth, preferredHeight));
    }
    
    public Map(Human person) {
        character = person;
        p = new PlayerModel(character);
        this.terrainGrid = new Color[NUM_ROWS][NUM_COLS];
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS; j++) {
                int index = this.colorLayout[j][i];
                this.terrainGrid[i][j] = this.terrain[index];
            }
        }
        int preferredWidth = NUM_COLS * PREFERRED_GRID_SIZE_PIXELS;
        int preferredHeight = NUM_ROWS * PREFERRED_GRID_SIZE_PIXELS;
        setPreferredSize(new Dimension(preferredWidth, preferredHeight));
    }

    public void init() {
        this.addKeyListener((KeyListener) this);
        this.setFocusable(true);
    }

    @Override
    public void paint(Graphics g) {
        // Important to call super class method
        super.paintComponent(g);
        // Clear the board
        g.clearRect(0, 0, getWidth(), getHeight());
        // Draw the grid
        int rectWidth = getWidth() / NUM_COLS;
        int rectHeight = getHeight() / NUM_ROWS;

        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS; j++) {
                // Upper left corner of this terrain rect
                int x = i * rectWidth;
                int y = j * rectHeight;
                Color terrainColor = terrainGrid[i][j];
                g.setColor(terrainColor);
                g.fillRect(x, y, rectWidth, rectHeight);
            }
        }

        p.paintModel(g);
    }

    public PlayerModel getP() {
        return p;
    }

    public void setP(PlayerModel p) {
        this.p = p;
    }

    public boolean collision(int x, int y, KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                if(terrainGrid[x - 1][y] != terrain[3] && terrainGrid[x - 1][y] != terrain[4]){
                    return true;
                }
                break;
            case KeyEvent.VK_RIGHT:
                if(terrainGrid[x + 1][y] != terrain[3] && terrainGrid[x + 1][y] != terrain[4]){
                    return true;
                }
                break;
            case KeyEvent.VK_UP:
                if(terrainGrid[x][y - 1] != terrain[3] && terrainGrid[x][y - 1] != terrain[4]){
                    return true;
                }
                break;
            case KeyEvent.VK_DOWN:
                if(terrainGrid[x][y + 1] != terrain[3] && terrainGrid[x][y + 1] != terrain[4]){
                    return true;
                }
                break;
        } 
        return false;
    }

    public void combatCheck() {
        int roll = (int)Math.floor(Math.random() * 6 + 1);
        System.out.println(roll);
        if(roll == 6) {
            new Combat(character).setVisible(true);
            
        }
    }
    
    public static void main(String[] args) {
        // http://docs.oracle.com/javase/tutorial/uiswing/concurrency/initial.html
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Game");
                Map map = new Map();
                frame.add(map);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    System.out.println("vlevo");
                    if (p.x > 0) {
                        if (collision(this.p.x, this.p.y, e)) {
                            this.p.x--;
                            combatCheck();
                        }
                    }
                    //System.out.println(this.p.x);
                    break;
                case KeyEvent.VK_RIGHT:
                    System.out.println("vpravo");
                    if (p.x < NUM_COLS - 1) {
                        if (collision(this.p.x, this.p.y, e)) {
                            this.p.x++;
                            combatCheck();
                        }
                    }
                    //System.out.println(this.p.x);
                    break;
                case KeyEvent.VK_UP:
                    System.out.println("nahoru");
                    if (p.y > 0) {
                        if (collision(this.p.x, this.p.y, e)) {
                            this.p.y--;
                            combatCheck();
                        }
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    System.out.println("dolu");
                    if (p.y < NUM_ROWS - 1) {
                        if (collision(this.p.x, this.p.y, e)) {
                            this.p.y++;
                            combatCheck();
                        }
                    }
                    break;
            }
        this.repaint();
        character.setX(this.p.x);
        character.setY(this.p.y);
    }
}
