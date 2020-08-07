// Write a program and print the average of sum of all digits from a number

import java.lang.*;
import java.util.Scanner;

class Average {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int rem = 0;
        int sum = 0;
        int cnt = 0;

        while(num != 0) {

            rem = num % 10;
            cnt += 1;
            sum += rem;
            num /= 10;
        }
        if(cnt > 0) {

            System.out.println("Average is : " + (sum / cnt));
        }
        else {

            System.out.println("Enter a number greater than zero");
        }
    }
}