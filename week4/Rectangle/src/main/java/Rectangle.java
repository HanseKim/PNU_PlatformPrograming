import java.util.Scanner;

public class Rectangle {
    private Point r1;
    private Point r2;
    public Rectangle(Point p1, Point p2) {
        //Your code here
        this.r1=p1;this.r2=p2;
    }
    public void moveBy(int x, int y) {
        //Your code here
        r1.setX(r1.getX()+x);
        r2.setX(r2.getX()+x);
        r1.setY(r1.getY()+y);
        r2.setY(r2.getY()+y);
    }
    public void moveBy(int position) {
        //Your code here
        r1.setX(r1.getX()+position);
        r2.setX(r2.getX()+position);
        r1.setY(r1.getY()+position);
        r2.setY(r2.getY()+position);
    }

    @Override
    public String toString() {
        //Your code here
        return String.format("Rectangle[(%d,%d),(%d,%d)]",r1.getX(),r1.getY(),r2.getX(),r2.getY());
    }

}
