import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        
        // Q : Enter the basic salary of an employee of an organization through the keyboard. His dearness 
        // allowance (DA) is 40% of basic salary, and house rent allowance (HRA) is 20% of basic 
        // salary. Write a java program to calculate his gross salary. Print the DA, HRA and Gross 
        // salary.
        // Here is the sample run:
        // Enter basic salary: 15600
        // DA is 6240.0
        // HRA is 3120.0
        // Gross salary is 24960

        Scanner Sc = new Scanner (System.in);

        System.out.println("Enter the basic salary : ");

        int salary = Sc.nextInt();

        float D_A = ((40.0f /100 ) * salary);

        float H_R_A = ((20.0f / 100 ) * salary );

        float G_S = ( salary + D_A + H_R_A );

        System.out.println("D_A is :" + D_A + "\n" + "H_R_A is: " +  H_R_A + "\n" + "Gross salary is : " + G_S );

    }
}
