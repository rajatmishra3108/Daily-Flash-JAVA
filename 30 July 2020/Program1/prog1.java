/*
Program1: Write a java program to get two numbers and one operator from user and perform 
          calculator operations (+, -, *, /, %) on numbers using switch case
*/

import java.lang.*;
import java.util.Scanner;

class Cal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the operation to perform (+, -, *, /, %) :");
        char opr = sc.next().charAt(0);

        System.out.println("Enter integer first number :");
        int num1 = sc.nextInt();

        System.out.println("Enter integer second number :");
        int num2 = sc.nextInt();

        if(opr == '+') {

            System.out.println("Addition of " + num1  + " + " + num2 + " is " + (num1 + num2));
        } else if(opr == '-') {

            if (num1 >= num2) {

                System.out.println("Subtraction of " + num1 + " - " + num2 + " is " + (num1 - num2));
            } else {

                System.out.println("Subtraction of " + num2 + " - " + num1 + " is " + (num2 - num1));
            }
        } else if(opr == '/') {

            if (num1 >= num2) {

                System.out.println("Division of " + num1 + " / " + num2 + " is " + (num1 / num2));
            } else {

                System.out.println("Divison of " + num2 + " / " + num1 + " is " + (num2 / num1));
            }
        } else if(opr == '*') {

            System.out.println("Multiplication of " + num1 + " * " + num2 + " is " + (num1 * num2));
        } else if(opr == '%') {

            if (num1 >= num2) {

                System.out.println("Modulus of " + num1 + " % " + num2 + " is " + (num1 % num2));
            } else {

                System.out.println("Modulus of " + num2 + " % " + num1 + " is " + (num2 % num1));
            }
        } else {

            System.out.println("Enter a Valid Operator");
        }
    }
}