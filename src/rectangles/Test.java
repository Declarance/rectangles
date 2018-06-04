package rectangles;

public class Test {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1, 1, 4, 4);
        Rectangle r2 = new Rectangle(2, 3, 5, 6);
        Rectangle u = r1.union(r2);
        Rectangle i = r2.intersection(r1);
        if (u.isInside(r2.x1, r2.y1))
            System.out.println("(" + r2.x1 + ", " + r2.y1 + ")содержится в объединении");
        System.out.println(r1 + "union" + r2 + "=" + u);
        System.out.println(r1 + "intersection" + r2 + "=" + i);
    }
}
