import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        
        //  Q : Write a java program that reads an integer between 0 and 1000 and adds all the digits in the 
        // integer. For example, if an integer is 749, the sum of all its digits is 20. 
        // Hint: Use the % operator to extract digits, and use the / 
        // operator to remove the extracted digit. 
        // For instance, 749 % 10 = 9 and 749 / 10 = 74. 
        // Here is a sample run: 
        // Enter a number between 0 and 1000: 999 The sum of the 
        // digits is 27
       
        Scanner Sc = new Scanner (System.in);

        System.out.println("Enter any number between 0 - 1000 : "); 

        int num = Sc.nextInt();

        int a = (num % 10);
        int b = (num / 10);
        int c = (b % 10 );
        int d = (b / 10);
        int e = (d % 10);

        System.out.print("sum of digits of integer : " + num + " is "); 
        System.out.println( a + c + e);
     
    }  
}
