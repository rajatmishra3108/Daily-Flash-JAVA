/*
Write a Program to check whether the charachter is vowel or consonant
*/
import java.lang.*;

class Charachter {

    void charachter(char chr) {

        if(chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') {

            System.out.println(chr + " is a vowel");
        }
        else {
            
            System.out.println(chr + " is a consonant");
        }
    }

    public static void main(String[] args) {
        
        Charachter check = new Charachter();
        check.charachter('u');
    }
}