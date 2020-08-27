/* 
Question:
Write a program that accepts two intgers from user 
and prints multiplication and division of them.
*/
import java.lang.*;
import java.util.Scanner;

class Operations {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        System.out.printf("Multiplication of %d and %d is %d",num1, num2, (num1 * num2));
        System.out.printf("\nDivison of %d and %d is %d", num1 > num2 ? num1 : num2, num2 < num1 ? num2 : num1, num1 > num2 ? num1 / num2 : num2 / num1);
    }
}