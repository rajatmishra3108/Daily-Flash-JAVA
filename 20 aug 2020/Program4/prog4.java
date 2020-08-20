/*
Question : 
Write a Program to print following pattern
Output :
1   2   3   4
5   6   7   8
9   10  11  12
13  14  15  16
*/
import java.lang.*;

class Pattern {

    void square_num() {

        for(int i = 1; i <= 16; ++i) {

            if(i % 4 == 0){

                System.out.println(i + "  ");
            }
            else {

                System.out.print(i + "  ");
            }
        }
    }

    public static void main(String[] args) {
        
        Pattern draw = new Pattern();
        draw.square_num();
    }
}