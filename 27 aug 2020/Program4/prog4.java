/* 
Question:
Write a program to simulate simple calculator.
Accepts two integer from use and sign of operation to perform
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
        System.out.println("Enter the sign of operation : ");
        char chr = sc.next().charAt(0);

        if (chr == '+') {
            System.out.printf("Addition of %d and %d is %d",num1, num2, (num1 + num2));
        }
        else if(chr == '-') {
            System.out.printf("Subtraction of %d and %d is %d", num1 > num2 ? num1 : num2, num2 < num1 ? num2 : num1, num1 > num2 ? num1 - num2 : num2 - num1);
        }
        else if(chr == '*') {

            System.out.printf("Multiplication of %d and %d is %d",num1, num2, (num1 * num2));
        }
        else if(chr == '/') {

            System.out.printf("Divison of %d and %d is %d", num1 > num2 ? num1 : num2, num2 < num1 ? num2 : num1, num1 > num2 ? num1 / num2 : num2 / num1);
        }
    }
}