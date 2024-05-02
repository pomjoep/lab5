/**
 * Circle.java
 * @author M Mustafa Narejo
 */
import java.awt.*;

public class Circle extends Shape{

    private int radius;

    public Circle(int a, int b) {
        super(a, b);
        this.radius = 50;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(Graphics g){
        int x = getX();
        int y = getY();
        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }

    public void setRadius(int r){
        radius = r;
    }
    public int getRadius(){
        return radius;
    }
}
