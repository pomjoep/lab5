import java.awt.Color;
import java.awt.Graphics;

/**
 * Diamonds.java
 ========================
 * Description: Following Class creates a Diamond shape using inheritance from the Shape
 * class.
 * Pre-Condition: none
 * Post-Condition: none
 * @author M Mustafa Narejo
 * @version 5/1/2024
 */
public class Diamonds extends Shape{
    //Instance variables
    private int size;
    private Color color;

    public Diamonds(int x, int y) {
        // Inheriting x and y coordinates from the parent class Shape
        super(x, y);
        // Setting the color and size of the diamond
        this.color = Color.RED;
        this.size = 100;
    }

    /**
     * getArea method
     * ------------------------
     * Description: Calculates the area of the diamond
     * Pre-Condition: None
     * Post-Condition: Returns the area of the diamond
     */
    @Override
    public double getArea(){
        return Math.pow(size, 2);
    }

    /**
     * draw method
     * ------------------------
     * Description: Draws the diamond shape on the graphics object
     * Pre-Condition: Graphics object must be initialized
     * Post-Condition: Diamond is drawn on the graphics object with specified color and size
     */
    @Override
    public void draw(Graphics g) {
        //Initializing the variables to find the center of the diamond
        int x = getX();
        int y = getY();

        // Calculating the coordinates of the diamond's bounding square
        int left = x - (size / 2);
        int right = x + (size / 2);
        int top = y - (size / 2);
        int bottom = y + (size / 2);

        // Calculate the coordinates of the diamond's vertices
        int p1x = left + (int)(0.2 * size);
        int p1y = y;

        int p2x = x;
        int p2y = top + (int)(0.35 * size);

        int p3x = right - (int)(0.2 * size);
        int p3y = y;

        int p4x = x;
        int p4y = bottom - (int)(0.35 * size);

        // Set the color and draw all the lines to form the diamond
        g.setColor(color);
        g.drawLine(p1x, p1y, p2x, p2y);
        g.drawLine(p2x, p2y, p3x, p3y);
        g.drawLine(p3x, p3y, p4x, p4y);
        g.drawLine(p4x, p4y, p1x, p1y);
    }

    /**
     * getSize method
     * -----------------
     * Description: returns the size of the Object
     * Pre-Condition: none
     * Post-Condition: returns the size
     */
    public int getSize(){
        return size;
    }

    /**
     * getColor method
     * -----------------
     * Description: Returns the color of the Object
     * Pre-Condition: none
     * Post-Condition: returns the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * setColor method
     * -----------------
     * Description: Sets the color of the object
     * Pre-Condition: none
     * Post-Condition: none
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * setSize method
     * -----------------
     * Description: Following method sets the size of the size object
     * Pre-Condition: none
     * Post-Condition: none
     */
    public void setSize(int size) {
        this.size = size;
    }

}
