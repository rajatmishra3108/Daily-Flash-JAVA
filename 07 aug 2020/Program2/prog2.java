// Write a program and print addition of even digit and multiplication of odd digit from number

import java.lang.*;
import java.util.Scanner;

class Even_Odd {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int temp = num;
        int rem = 0;
        int even = 0;
        int odd = 0;

        while(num != 0) {

            rem = num % 10;
            if(rem % 2 == 0) {
                
                even += rem;
            }
            else {
                
                odd += rem;
            }
            num /= 10;
        }
        if(temp > 0) {

            System.out.println("Sum of even digits : " + even);
            System.out.println("Sum of odd digits : " + odd);
        }
        else {

            System.out.println("Enter a number greater than zero");
        }
    }
}