/*
Write a Program to check whether the charachter is digit, alphabet, or a special charachter
*/
import java.lang.*;

class Charachter {

    void charachter(char chr) {

        if((chr >= 'a' && chr <= 'z') || (chr >= 'A' && chr <= 'Z')) {

            System.out.println(chr + " is a alphabet");
        }
        else if (chr >= 0 && chr <= 9) {
            
            System.out.println(chr + " is a digit");
        }
        else {

            System.out.println(chr + " is a special charachter");
        }
    }

    public static void main(String[] args) {
        
        Charachter check = new Charachter();
        check.charachter('*');
    }
}