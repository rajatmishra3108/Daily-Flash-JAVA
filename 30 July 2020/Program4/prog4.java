/*
Program 3 : Write a java program to take any number (0-9 only) from user (int type) and 
            print the entered number in word using switch case.
*/
 import java.lang.*;
 import java.util.Scanner;

 class Number {

    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number between 0 to 9 :");
        byte num = inp.nextByte();

        switch (num) {

            case 0:
            System.out.println("Zero");
            break;

            case 1:
            System.out.println("One");
            break;

            case 2:
            System.out.println("Two");
            break;

            case 3:
            System.out.println("Three");
            break;

            case 4:
            System.out.println("Four");
            break;

            case 5:
            System.out.println("Five");
            break;

            case 6:
            System.out.println("Six");
            break;

            case 7:
            System.out.println("Seven");
            break;

            case 8:
            System.out.println("Eight");
            break;

            case 9:
            System.out.println("Nine");
            break;
        
            default:
            System.out.println("Enter a vaid Number");
            break;
        }
    }
 }