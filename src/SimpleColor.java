package src;

// TODO If you use this class because you dont have your
// previous SimpleColor, you must document the code with comments
// and fix the setters so they don't invalidate the [0-255] rule.
public class SimpleColor {
    private int r;
    private int g;
    private int b;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        if(r > 255 || r < 0){
            throw  new ColorException("Invalid R value");
        } else{
            this.r = r;
        }
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        if(g > 255 || g < 0){
            throw new ColorException("Invalid G value");
        } else{
            this.g = g;
        }
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if(b > 255 || b < 0){
            throw new ColorException("Invalid B value");
        } else{
            this.b = b;
        }
    }

    public void setColor(int a, int b, int c){
        setR(a);
        setG(b);
        setB(c);
    }

    public SimpleColor() {
    }

    public SimpleColor(int r, int g, int b) {
        setR(r);
        setG(g);
        setB(b);
    }

    public SimpleColor(SimpleColor other) {
        this(other.r, other.g, other.b);
    }

    public static void main(String[]args){
        throw new ColorException("A test in main");
    }
}
