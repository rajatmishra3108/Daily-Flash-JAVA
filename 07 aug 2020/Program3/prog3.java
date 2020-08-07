/* Write a program using while loop to print first 10 numbers which are divisible by 32 and 7.
   (Break the loop if any number by 32 and 7 is divisible by 6) */

import java.lang.*;
import java.util.Scanner;

class Divisibility_Check {

    public static void main(String[] args) {
        
        int cnt = 0;
        int x = 1;

        while(cnt != 10) {

            if(x % 7 == 0 && x % 32 == 0) {

                if(x % 6 == 0) {

                    System.out.println("Loop breaked because " + x + " is divisble by 7, 32 and 6");
                    break;
                }
                else {
                    
                    System.out.println(x);
                    cnt += 1;
                }
            }
            ++x;
        }   
    }
}