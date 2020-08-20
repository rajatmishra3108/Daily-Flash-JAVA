/*
Question : 
Write a program to calculate Simple Iterest. 
Taking all essential terms to compute as input.
*/
import java.lang.*;
import java.util.Scanner;

class SimpleInterest {
 
    public static void main(String[] args) {
        
        double principal_amount, IR_per_year, time;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount : ");
        principal_amount = sc.nextDouble();
        System.out.println("Enter the Interest rate per year : ");
        IR_per_year = sc.nextDouble();
        System.out.println("Enter the time period in years : ");
        time = sc.nextDouble();

        double simple_interest = (principal_amount * IR_per_year * time) / 100;
        System.out.println(simple_interest);
    }
}