// Write a program to count number of digits in a number

import java.lang.*;
import java.util.Scanner;

class Count {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int rem = 0;
        int cnt = 0;

        while(num != 0) {

            rem = num % 10;
            cnt += 1;
            num /= 10;
        }
        
        System.out.println("Count of number of digits is : " + cnt);
    }
}