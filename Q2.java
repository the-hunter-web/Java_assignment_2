import java.util.*;

public class Q2 { 
    public static void main(String[] args) {
        
        // Q : The distance between two cities (in km.) is input through the keyboard. Write a java program 
        // to convert and print this distance in meters, feet, inches and centimetres.
        // Hint:
        // 1km=1000meter, 1km=3280.8399feet, 1km= 39370.0787 inch, 
        // 1km= 100000 centimetre
        // Here is the sample run:
        // Enter the distance in km=165
        // 165 km is 165000 meters
        // 165 km is 541338.5835 feet
        // 165 km is 6496062.9854999995 inch
        // 165 km is 16500000 centimetres
        
        Scanner Sc = new Scanner (System.in);

        System.out.println("Enter the distance in kilometer : ");

        int km = Sc.nextInt();

        float meter = ( km * 1000);

        float feet = ( km * 3280.8399f);

        float inch = ( km * 39370.0787f);

        float c_m = ( km * 100000);

        System.out.println(km + " km in meter is : " + meter + "\n" + km + " km in feet is : " + feet + "\n" + km + " km in inch is : " + inch + "\n" + km + " km in centimeter is : " + c_m);
    }
    
}
