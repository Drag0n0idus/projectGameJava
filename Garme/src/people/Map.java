/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    public int[][] colorLayout = new int[][]{
        {2,2,2,2,2,2,2,2,2,2,2,2,5,5,0,0,0,0,0,0},
        {2,2,2,2,2,2,2,2,2,2,2,2,5,5,0,0,0,0,0,0},
        {2,2,2,2,5,5,5,5,5,5,5,5,5,5,5,5,0,0,0,0},
        {2,2,2,2,5,5,5,5,5,5,5,5,5,5,5,5,0,0,0,0},
        {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,0,0,0,0},
        {5,5,0,5,5,5,5,1,1,1,1,1,1,1,5,5,0,0,0,5},
        {5,5,5,5,5,1,1,1,2,2,3,3,3,1,5,5,5,5,5,5},
        {5,5,5,5,5,1,2,2,2,3,3,3,3,1,5,5,5,5,5,2},
        {5,5,5,5,5,1,2,2,3,3,3,3,3,1,5,5,5,2,2,2},
        {5,5,5,5,5,1,5,5,5,5,2,2,3,1,5,5,2,2,2,2},
        {1,1,1,1,1,1,1,1,1,5,2,2,5,1,5,5,2,2,2,2},
        {2,2,5,5,5,5,5,5,1,5,5,5,5,1,5,5,5,5,2,2},
        {2,2,2,2,2,5,5,5,1,1,1,1,1,1,5,5,5,5,2,2},
        {4,4,4,4,2,2,2,5,5,5,5,5,5,1,5,5,5,5,5,5},
        {4,4,4,4,2,2,2,2,5,5,5,5,5,1,1,5,5,5,5,5},
        {4,4,4,4,4,4,2,2,5,5,5,5,5,5,1,5,5,5,5,5},
        {4,4,4,4,4,4,2,2,2,5,5,5,5,5,1,1,1,1,1,1},
        {4,4,4,4,4,4,4,4,2,2,5,5,5,5,5,5,5,5,5,5},
        {4,4,4,4,4,4,4,4,2,2,2,5,5,5,5,5,5,5,5,5},
        {4,4,4,4,4,4,4,4,4,2,2,2,5,5,5,5,5,5,5,5},
    };
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

    public static final int PREFERRED_GRID_SIZE_PIXELS = 30;

    // In reality you will probably want a class here to represent a map tile,
    // which will include things like dimensions, color, properties in the
    // game world.  Keeping simple just to illustrate.
    private Color[][] terrainGrid;

    public Map(){
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

    @Override
    public void paintComponent(Graphics g) {
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
}
