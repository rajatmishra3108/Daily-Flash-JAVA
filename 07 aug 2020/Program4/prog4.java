// Write a Program that prints maximum digit from a number

import java.lang.*;
import java.util.Scanner;

class Maximum {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();
        int max = 0;
        int rem = 0;

        while(num != 0) {

            rem = num % 10;
            if(rem > max) {

                max = rem;
            }
            num /= 10;
        }
        System.out.println("Max digit from the entered number is : " + max);
    }
}