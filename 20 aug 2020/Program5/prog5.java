/*
Question :
Write a program to take marks of five subjects 
Physics, Chemistry, Biology, Mathematics and Computer.
Calculate percentage and grade according to following:
Output :
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F
*/
import java.lang.*;
import java.util.Scanner;

class Percentage {

    void percent_and_grade(int physics, int chemistry, int biology, int maths, int computer) {

        int total = (physics + chemistry + biology + maths + computer / 500) * 100;

        if(total >= 90) {

            System.out.println("Grade A");
        }
        else if(total >= 80) {
            
            System.out.println("Grade B");
        }
        else if(total >= 70) {

            System.out.println("Grade C");
        }
        else if(total >= 60) {

            System.out.println("Grade D");
        }
        else if(total >= 40) {

            System.out.println("Grade E");
        }
        else {

            System.out.println("Grade F");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Physics Marks : ");
        int physics = sc.nextInt();
        System.out.println("Enter chemistry Marks : ");
        int chemistry = sc.nextInt();
        System.out.println("Enter biology Marks : ");
        int biology = sc.nextInt();
        System.out.println("Enter maths Marks : ");
        int maths = sc.nextInt();
        System.out.println("Enter computer Marks : ");
        int computer = sc.nextInt();

        Percentage check = new Percentage();
        check.percent_and_grade(physics, chemistry, biology, maths, computer);
    }
}