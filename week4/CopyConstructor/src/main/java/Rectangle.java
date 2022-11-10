public class Rectangle {
    //your code here
    private Point r1;
    private Point r2;
    public Rectangle(Point p1, Point p2) {
        //your code here
        r1 = p1;
        r2 = p2;
    }
    //copy constructor
    public Rectangle(Rectangle rectangle) {
        //your code here
        r1 = new Point(rectangle.r1.getX(),rectangle.r1.getY());
        r2 = new Point(rectangle.r2.getX(),rectangle.r2.getY());
    }

    public void moveBy(int x, int y) {
        //your code here
        r1.setX(r1.getX()+x);
        r1.setY(r1.getY()+y);
        r2.setX(r2.getX()+x);
        r2.setY(r2.getY()+y);
    }

    @Override
    public String toString() {
        //your code here
        return String.format("Rectangle[(%d,%d),(%d,%d)]",r1.getX(),r1.getY(),r2.getX(),r2.getY());
    }
}