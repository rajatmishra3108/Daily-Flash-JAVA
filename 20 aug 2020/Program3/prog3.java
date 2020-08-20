/*
Write a program to check if a year is leap year or not.
{Note: If a year is divisible by 4 then it is a leap year
       but if the year is century year like 2000, 1900, 2100
       then it must be divisible by 400}
*/
import java.lang.*;
import java.util.Scanner;

class Leap {

    void is_leapyear(int year) {

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {

            System.out.println(year + " is a leap year");
        }
        else {

            System.out.println(year + " is not a leap year");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year = sc.nextInt();

        Leap check = new Leap();
        check.is_leapyear(year);
    }
}