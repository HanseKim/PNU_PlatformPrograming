public class Rectangle implements MyComparable,AreaComputable{
    private int x,y,area;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
        this.area = x*y;
    }

    @Override
    public float getArea() {
        return area;
    }

    @Override
    public int compareTo(Object other) {
        Rectangle otherRectangle = (Rectangle) other ;
        int returnValue = 0 ;
        if ( area < otherRectangle.area ) returnValue = -1 ;
        if ( area == otherRectangle.area ) returnValue = 0 ;
        if ( area > otherRectangle.area ) returnValue = 1 ;
        return returnValue ;
    }

    @Override
    public boolean equal(Object other) {
        return x==((Rectangle) other).x && y==((Rectangle)other).y && area==((Rectangle)other).area;
    }
    @Override
    public String toString(){
        return String.format("Rectangle{Width:\t%d, Height:\t%d}",x,y);
    }
}
