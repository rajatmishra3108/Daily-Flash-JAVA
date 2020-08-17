/* 
Write a Program to print following pattern
1  1  1  1
1  1  1  1
1  1  1  1
1  1  1  1
*/
import java.lang.*;

class Pattern {

	void square_pattern() {

		for(int i = 0; i < 16; ++i) {

			if(i == 3 || i == 7 || i == 11) {

				System.out.println("1  ");
			}
			else {

				System.out.print("1  ");
			}
		}
	}

	public static void main(String[] args) {
		
		Pattern draw = new Pattern();
		draw.square_pattern();
	}
}