package rectangles;

public class Square{
    public int x1,y1,x2,y2;

    public Square(int x1,int y1,int x2,int y2){
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

    public Square(int width, int height) {
        this(0,0,width,height);
    }

    public Square(){this(0,0,0,0);}

    public String toString(){return "("+this.x1+", "+this.y1+"; "+this.x2+", "+this.y2+")";}

    public void print(){System.out.println("Square: "+this.toString());}

    public void move(int deltaX,int deltaY){
        this.x1 +=deltaX;
        this.y1 +=deltaY;
        this.x2 +=deltaX;
        this.y2 +=deltaY;
    }

    public double radiusInner(){

    }
}
