import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        
//  Q :   When a brick is dropped from a tower, it falls faster and faster until it hits the earth. The 
// distance it travels is given by d = (1/2) gt2
// Here d is in feet, t is the time in seconds, and g is 32.174.
// Write a program that asks the user for the number of seconds and then prints out the distance 
// travelled.
// Here is the sample run:
// Enter the number of seconds: 5.4 
// Distance travelled: 469.096

        Scanner Sc = new Scanner (System.in);

        System.out.println("Enter the time of fall :");

        float time = Sc.nextFloat();

        float distance = ((1.0f/2) * 3.174f * (time * time )); 

        System.out.println("Distance travelled in " + time + "second is : " + distance  );

    }
}
