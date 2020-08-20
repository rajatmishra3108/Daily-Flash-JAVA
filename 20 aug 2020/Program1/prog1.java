/*
Question : 
Write a Program to take all three sides of triangle from user and
check whether the triangle satisfies the Pythagorean Theorem.
Input :
side 1 = 3
side 2 = 4
Hypotenuse = 5
Output:
Triangle Satisfies the Pythagorean Theorem
*/
import java.lang.*;

class Pythagorean {

    void is_pythagorean(int side1, int side2, int hypotenuse) {

        if(side1*side1 + side2*side2 == hypotenuse*hypotenuse) {

            System.out.println("Triangle Satisfies the Pythagorean Theorem");
        }
        else {

            System.out.println("Triangle do not Satisfies the Pythagorean Theorem");
        }
    }

    public static void main(String[] args) {
        
        Pythagorean triangle = new Pythagorean();
        triangle.is_pythagorean(3, 4, 5);
    }
}