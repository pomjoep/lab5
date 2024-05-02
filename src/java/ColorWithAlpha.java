/**
 * ColorWithAlpha.java
 * @author M Mustafa Narejo
 */
public class ColorWithAlpha extends SimpleColor{
    private int alpha;
    public ColorWithAlpha(int r, int g, int b, int alpha) {
        super(r,g,b);
        this.alpha = alpha;
    }
    public ColorWithAlpha(int alpha){
        this.alpha = alpha;
    }
    public ColorWithAlpha(ColorWithAlpha other){
        super(other);
        this.alpha = other.alpha;
    }

    public int getAlpha() {
        return alpha;
    }
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    @Override
    public String toString() {
        return super.toString() + ", alpha: "+ alpha;
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof ColorWithAlpha){
            ColorWithAlpha c = (ColorWithAlpha)o;
            return this.alpha == c.alpha;
        }
        if(o instanceof ColorWithAlpha){
            this.alpha = ((ColorWithAlpha)o).alpha;
        }

        return super.equals(o);
    }
}
