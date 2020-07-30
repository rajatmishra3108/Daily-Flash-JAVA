/*
Program 3 : Write a java program to get input RTO code from user and show corresponding indian state. Name using switch case. 
           (Take minimum 5 cases)
*/

import java.lang.*;
import java.util.Scanner;

class RTO {

    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter a RTO Code (MH, AP, MP, UP, JK) :");
        String userinp = inp.nextLine();

        switch(userinp) {

            case "MH":
            System.out.println("MH : Maharsahtra");
            break;

            case "AP":
            System.out.println("AP : Arunachal Pradesh");
            break;

            case "MP":
            System.out.println("MP : Madhya Pradesh");
            break;

            case "UP":
            System.out.println("UP : Uttar Pradesh");
            break;

            case "JK":
            System.out.println("JK : Jammu and Kashmir");
            break;

            default:
            System.out.println("Enter a valid RTO Code from given list");
            break;
        }
    }
}