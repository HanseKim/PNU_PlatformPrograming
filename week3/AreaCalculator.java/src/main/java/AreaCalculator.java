import java.util.Locale;
import java.util.Scanner;

enum Shape{TRIANGLE,RECTANGLE,CIRCLE,QUIT, OTHER}

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.next();
            Shape s;
            try{
                s = Shape.valueOf(str.toUpperCase(Locale.ROOT));
            }catch(Exception e){
                s = Shape.OTHER;
            }
            if(s == Shape.QUIT){
                System.out.println("Bye");
                break;
            }
            switch(s){
                case TRIANGLE:
                    double base,t_height,t_area;
                    base = sc.nextDouble();
                    t_height = sc.nextDouble();
                    t_area = (base * t_height)/2.0;
                    System.out.printf("Area of Triangle: %.2f%n",t_area);
                    break;
                case RECTANGLE:
                    double width,r_height,r_area;
                    width = sc.nextDouble();
                    r_height = sc.nextDouble();
                    r_area = width * r_height;
                    System.out.printf("Area of Rectangle: %.2f%n",r_area);
                    break;
                case CIRCLE:
                    double radius,area;
                    radius = sc.nextDouble();
                    area = Math.PI * radius * radius;
                    System.out.printf("Area of Circle: %.2f%n",area);
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
