package Day_4;
import java.util.*;
public class CylinderAreaOfSurface {
    private double radius ;
    private double height;
    private double area ;
     public  void areaDetails(){
      area=2*3.14*radius*height;
        System.out.println("area"+area);
     }
     
     public CylinderAreaOfSurface(double radius, double height){
         this.radius = radius;
         this.height = height;
     }
     
     public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius and height :");
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        CylinderAreaOfSurface find = new CylinderAreaOfSurface(radius, height);
        find.areaDetails();
        
     }
    
    
}
