/*
Program 3 : Write a java program to get any number from user and check whether the entered number
            is greater than or less than or equal to zero
*/
import java.lang.*;
import java.util.Scanner;

class Greater {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        short num = sc.nextShort();

        if(num > 0) {

            System.out.println(num + " is greater than 0 ");
        }
        else if(num < 0) {

            System.out.println(num + " is less than 0 ");
        }
        else {

            System.out.println(num + " is equal to 0 ");
        }
    }
}