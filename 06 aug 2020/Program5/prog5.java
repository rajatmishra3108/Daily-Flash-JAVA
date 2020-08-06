/* Write a java prog to print table of 3 also print numbers which are even */

import java.lang.*;
import java.util.Scanner;

class Table {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to print its table : ");
        int num = sc.nextInt();

        for(int i = 1; i <= 10; i++) {

            System.out.println(num + " * " + i + " = " + (num * i));
        }

        System.out.print("Even numbers from table are : ");

        for(int i = 1; i <= 10; i++) {

            if((num * i) % 2 == 0) {

                System.out.print((num * i) + " ");
            }
        }
    }
}