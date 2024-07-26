import java.util.*;

public class Q1 {
    public static void main(String[] args) {

        //       Q :  Write a java program that reads a Fahrenheit degree in a double value from the console, then 
        // converts it to Celsius and displays the result. The formula for the conversion is as follows:
        // Celsius = (Fahrenheit-32) *(5/9)
        // Hint: Hint: In Java, 5 / 9 is 0, but 5.0 / 9 is 0.556
        // Here is a sample run:
        // Enter a degree in Fahrenheit: 54 
        // 54 Fahrenheit is 12.22 Celsius

        Scanner Sc = new Scanner (System.in);

        System.out.println("Enter the temperature in Fahrenheit :"); 
        int F = Sc.nextInt();

        float Celcius = (( F - 32 ) * (5.0f/9) );

        System.out.println( F + " Fahrenheit is : " + Celcius + "Celcius .");

    }
}