public class Circle {
    
    public static void main(String[] args){
        double radius, area, circumference;
        
        final double PI = 3.14;
        
        radius = 1.2;
        
        area = radius * radius * PI;        
        circumference = 2.0 * radius * PI;
              
        // 6 --> 8 --> 10 --> 11
     
        System.out.println("The radius is ");
        System.out.println(radius);
        System.out.println("The area is ");
        System.out.println(area);
        System.out.println("The circumference is ");
        System.out.println(circumference);
    }
}
