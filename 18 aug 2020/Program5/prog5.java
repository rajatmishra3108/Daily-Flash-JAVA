/* Write a Program to find maximum between three numbers */

import java.lang.*;

class Maximum {

    void max_number(int num1, int num2, int num3) {

        if(num1 > num2 && num1 > num3) {

            System.out.println(num1 + " is greater from " + num2 + " and " + num3);
        }
        else if(num2 > num1 && num2 > num3) {

            System.out.println(num2 + " is greater from " + num1 + " and " + num3);
        }
        else {

            System.out.println(num3 + " is greater from " + num2 + " and " + num1);
        }
    }

    public static void main(String[] args) {
        
        Maximum check = new Maximum();
        check.max_number(36, 24, 31);
    }
}