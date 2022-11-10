public class Rectangle implements MyComparable{
    private int area=0;
    private int height,width;
    public String toString(){
        return String.format("Rectangle{area=%d}",area);
    }
    public Rectangle(int width,int height){
        this.height = height;
        this.width = width;
        this.area = height*width;
    }
    @Override
    public int compareTo(Object other)
    {
        if ( ! (other instanceof Rectangle) ) return -2 ;
        Rectangle otherCircle = (Rectangle) other ;
        int returnValue = 0 ;
        if ( area < otherCircle.area ) returnValue = -1 ;
        if ( area == otherCircle.area ) returnValue = 0 ;
        if ( area > otherCircle.area ) returnValue = 1 ;
        return returnValue ;
    }
    @Override
    public boolean equal(Object other)
    {
        if ( !( other instanceof Rectangle )) return false ;
        Rectangle otherCircle = (Rectangle) other ;
        return height == otherCircle.height && width == otherCircle.width && area == otherCircle.area ;
    }
}
