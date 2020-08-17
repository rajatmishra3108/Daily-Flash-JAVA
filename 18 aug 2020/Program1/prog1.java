/* 
Write a Program to check whether the charchter is alphabet or not
*/
import java.lang.*;

class Alphabet {

	void isAlpha(char chr) {

		if((chr >= 'a' && chr <= 'z') || (chr >= 'A' && chr <= 'Z')) {

			System.out.println(chr + " is an aplhabet");
		}
		else {

			System.out.println(chr + " is not an aplhabet");
		}
	}

	public static void main(String[] args) {
		
		Alphabet check = new Alphabet();
		check.isAlpha('R');
	}
}