package rectangles;

public class main {

    public static void main (String[] args){
        Rectangle R = new Rectangle(-5,-5,5,0);
        R.print();
        //R.move (5,2);
        //R.print();
        Rectangle H = new Rectangle (0, 6, -2,5);
        H.print();
        //System.out.println(R.union(H));
        System.out.println(R.radiusOut());
        System.out.println(R.square());
    }
}
