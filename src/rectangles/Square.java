package rectangles;

public class Square{

    public double x1,y1,x2,y2;

    public Square(double x1,double y1,double x2,double y2){
        if (Math.abs(x2-x1)==Math.abs(y2-y1)){
            this.x1=x1;
            this.y1=y1;
            this.x2=x2;
            this.y2=y2;
        }
        else {
            System.out.print("It's not a square!");
        }
    }

    public Square(double width) {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = width;
        this.y2 = width;
    }

    public Square(){this(0,0,0,0);}

    public String toString(){return "("+this.x1+", "+this.y1+"; "+this.x2+", "+this.y2+")";}

    public void print(){System.out.println("Square: "+this.toString());}

    public void move(double deltaX,double deltaY){
        this.x1 +=deltaX;
        this.y1 +=deltaY;
        this.x2 +=deltaX;
        this.y2 +=deltaY;
    }

    public double radiusInner(){
        return Math.abs((this.x2-this.x1)/2);
    }

    public Square union(Square r){
        return new Square((this.x1<r.x1)? this.x1 : r.x1,
                (this.y1<r.y1)? this.y1 : r.y1,
                (this.x2<r.x2)? this.x2 : r.x2,
                (this.y2<r.y2)? this.y2 : r.y2);
    }
}
