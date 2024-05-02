
public class SimpleColor {
    private int r;
    private int g;
    private int b;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        if(g<0||g>255) {
            throw new ColorException();
        }
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g){
        if(g<0||g>255) {
            throw new ColorException();
        }
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if(g<0||g>255) {
            throw new ColorException();
        }
        this.b = b;
    }

    public void setColor(int a, int b, int c) {
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

    public String toString(){
        return String.format("r=%d, g=%d, b=%d", r, g, b);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
