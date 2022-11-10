public class Circle2 implements MyComparable, AreaComputable {
    private int x, y ;
    private int radius ;
    public Circle2(int x, int y, int radius) {
        this.x = x ; this.y = y ; this.radius = radius ;
    }
    public float getArea() { return (float) Math.PI * radius * radius ; }
    public int compareTo(Object other) {
        Circle2 otherCircle2 = (Circle2) other ;
        int returnValue = 0 ;
        if ( radius < otherCircle2.radius ) returnValue = -1 ;
        if ( radius == otherCircle2.radius ) returnValue = 0 ;
        if ( radius > otherCircle2.radius ) returnValue = 1 ;
        return returnValue ;
    }
    public boolean equal(Object other) {
        return x==((Circle2) other).x && y==((Circle2)other).y && radius==((Circle2)other).radius;
    }
    public String toString() {
        return String.format("Circle2{x=%d,y=%d,radius=%d}",x,y,radius);
    }
}