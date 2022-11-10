import java.util.Scanner;

class Triangle{
    private int base;
    private int height;
    private double area;
    public Triangle(int _base, int _height){
        base = _base;
        height = _height;
    }
    public void getArea(){
        area = ((double) base * height) / 2;
    }
    public String toString(){
        System.out.printf("Triangle [base=%d, height=%d, area=%.2f]\n",base,height,area);
        return null;
    }
}

public class TriangleTest {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Triangle[] triangles = new Triangle[n];
        for(int i=0;i< triangles.length;i++){
            int base,height;
            base = sc.nextInt();
            height = sc.nextInt();
            triangles[i] = new Triangle(base,height);
            triangles[i].getArea();
            triangles[i].toString();
        }
    }
}
