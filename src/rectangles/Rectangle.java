package rectangles;

public class Rectangle{

    public int x1,y1,x2,y2;

    public Rectangle(int x1,int y1,int x2,int y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }

    public Rectangle(int width, int height) {
        this(0,0,width,height);
    }

    public Rectangle(){
        this(0,0,0,0);
    }

    public String toString(){return "("+this.x1+", "+this.y1+"; "+this.x2+", "+this.y2+")";}

    public void print(){System.out.println("Rectangle: "+this.toString());}

    public void move (int deltaX, int deltaY) {
        this.x1 +=deltaX;
        this.y1 +=deltaY;
        this.x2 +=deltaX;
        this.y2 +=deltaY;
    }

    public boolean isInside(int x, int y) { return ((x>=this.x1) && (x<=this.x2) && (y>=this.y1) && (y<=this.y2)); }

    public Rectangle union(Rectangle r){return new Rectangle((this.x1<r.x1)? this.x1 : r.x1,(this.y1<r.y1)? this.y1 : r.y1,(this.x2<r.x2)? this.x2 : r.x2,(this.y2<r.y2)? this.y2 : r.y2);}

    public Rectangle intersection(Rectangle r) {
        Rectangle result = new Rectangle ((this.x1<r.x1)? this.x1 : r.x1,
                (this.y1<r.y1)? this.y1 : r.y1,
                (this.x2<r.x2)? this.x2 : r.x2,
                (this.y2<r.y2)? this.y2 : r.y2);
        if (result .x1> result.x2) {result.x1 = result.x2 = 0;}
        if (result .y1> result.y2) {result.y1 = result.y2 = 0;}
        return result;
    }

    public int square() {
        return Math.abs((this.x2 - this.x1)*(this.y2 - this.y1));
    }

    public double radiusOut(){
        return Math.sqrt(Math.pow(this.x2 - this.x1,2) + Math.pow(this.y2 - this.y1,2)) / 2;
    }


}
