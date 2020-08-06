/* Write a java prog to take value from user and print it in rev order till 0 and also print numbers div by 5 */

import java.lang.*;
import java.util.Scanner;

class Reverse {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.print("Reverse Order : ");

        if(num > 0) {
            for(int i = num; i >= 0; i--) {
                System.out.print(i + " ");
            }
        }
        else {
    
            System.out.print("0 is last number");
        }

        System.out.print("\nDivisible by 5 : ");

        for(int i = num; i >= 0; i--) {

            if(i % 5 == 0) {

                System.out.print(i + " ");
            }
        }
    }
}
