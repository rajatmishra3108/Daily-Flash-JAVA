/* 
Question:
Write a program that accepts two intgers from user 
and prints addition of their cubes and subtraction of their squares.
*/

import java.lang.*;
import java.util.Scanner;

class Operations {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        int c1 = num1*num1*num1;
        int c2 = num2*num2*num2;
        int s1 = num1*num1;
        int s2 = num2*num2;

        System.out.printf("Addition of %d and %d is %d", c1, c2, (c2 + c1));
        System.out.printf("\nSubtraction of %d and %d is %d",s1, s2, (s1 - s2));
}