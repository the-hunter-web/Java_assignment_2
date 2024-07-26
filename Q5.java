import java.util.*;
import java.lang.Math;

public class Q5 {
    public static void main(String[] args) {
        
            // Q :  Write a java program that reads the radius of a hemisphere and computes the surface area 
            // and volume using the following formulas: 
            // . Surface Area of Hemisphere = 3 π r2
            // . Volume of a hemisphere = (2/3)πr3
            // Where π is a constant whose value is equal to 3.14 approximately. “r” is the radius of the 
            // hemisphere. Hint: Use Math.PI.
            // Here is a sample run: 
            // Enter the radius of the hemisphere: 7.0 
            // The surface area of the hemisphere is 461.814 
            // The volume area of the hemisphere is 718.377

            Scanner Sc = new Scanner (System.in); 

            System.out.println("Enter the radius of the hemisphere : ");

            int radius = Sc.nextInt();

//            float s_a_h = ((3.14f * 3 ) * (radius * radius ));
        float s_a_h = (((float)Math.PI * 3 ) * (radius * radius ));

            float v_h = ((2.0f/3) * 3.14f * (radius * radius * radius ));

            System.out.println("Surface area of hemisphere is : " + s_a_h);
            System.out.println("volume of hemisphere is :" + v_h); 


    }
}
