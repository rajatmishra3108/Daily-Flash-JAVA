import java.util.Scanner;

/* Write a java program that accepts the student year and student marks and using that stud year and marks
   it will check student is eligible or not for educational scholarship by help of nested switch case.
   Condition 1: In first switch case take param as student year and in nested take as stud marks.
   1st n 2nd year stud aren't eligible for education scholarship */

import java.lang.*;
import java.util.Scanner;

class Scholarship {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student year :");
        int year = sc.nextInt();

        switch(year) {

            case 3:
            System.out.println("Enter Student Marks in Integer format : ");
            int marks1 = sc.nextInt();
            if (marks1 >= 75) {
                
                System.out.println("Student is eligible for scholarship");
            }
            else {

                System.out.println("Student isn't eligible for scholarship");
            }
            break;

            case 4:
            System.out.println("Enter Student Marks in Integer format : ");
            int marks2 = sc.nextInt();
            if (marks2 >= 75) {
                
                System.out.println("Student is eligible for scholarship");
            }
            else {

                System.out.println("Student isn't eligible for scholarship");
            }
            break;

            default:
            System.out.println("1st and 2nd year students aren't eligible for scholarship");
        }
    }
}