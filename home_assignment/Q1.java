package home_assignment;

import java.util.Scanner;

public class Q1 {
    public static void main (String [] args) {

        Scanner Sc = new Scanner (System.in);
        int m = 1000000000;
        float prod = ((float)m/(60*24));
//        System.out.println(day);
        int days = (int)prod % 365 ;
        int years = (int)prod / 365;
        System.out.println(days);
        System.out.println(years);
    }
}
