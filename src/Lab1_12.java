import java.awt.Point;
public class Lab1_12 {
    
    public static void main(String[] args) {
        System.out.println("Task 1: " + q1());
        System.out.println("Task 2: " + q2());
        System.out.println("Task 3: " + q3());
        System.out.println("Task 4: " + q4());
    }

    // 1. Create Point (5,10) and return coordinates
    public static String q1() {
        Point p1 = new Point(5,10);
        return "(" + ((int) p1.getX()) + ", " + ((int) p1.getY()) + ")";
    }

    // 2. Move a Point (0,0) to (4,7) and return coordinates
    public static String q2() {
        Point p2 = new Point(0,0);
        p2.move(4, 7);

        return "(" + ((int) p2.getX()) + ", " + ((int) p2.getY()) + ")";
    }

    // 3. Find distance between (0,0) and (3,4)
    public static double q3() {
        Point p3 = new Point(0,0);
        Point p4 = new Point(3,4);

        return Point.distance(p3.getX(), p3.getY(), p4.getX(), p4.getY());
    }

    // 4. Show that two Points with same values are different objects
    public static String q4() {
        Point p5 = new Point(1,6);
        Point p6 = new Point(1, 6);

        boolean Value = (p5 == p6);
        boolean Memory = (p5.equals(p6));
        

        return Value + ", " + Memory;
    }
}
