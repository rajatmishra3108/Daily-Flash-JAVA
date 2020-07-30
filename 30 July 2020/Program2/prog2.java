/*
Program 2: Write a java program to get any input charachter from user and display any corresponding programming language using switch case. 
           (Take minimum 5 cases)
*/

import java.lang.*;
import java.util.Scanner;

class Lang {

    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter a Charachter (c, p, j, s, d) :");
        char userinp = inp.next().charAt(0);

        switch(userinp) {

            case 'c':
            System.out.println("Some languages Starting from c are c, c++ and css");
            break;

            case 'p':
            System.out.println("Some languages Starting from p are python, pearl, php");
            break;

            case 'j':
            System.out.println("Some languages Starting from java, javascript");
            break;

            case 's':
            System.out.println("Some languages Starting from s are swift, squirrel");
            break;

            case 'd':
            System.out.println("Some languages Starting from d are dart, darwin");
            break;

            default:
            System.out.println("Enter a valid charachter");
            break;
        }
    }
}