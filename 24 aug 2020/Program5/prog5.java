/* 
Write a program to print the following pattern 
0   0   0   0
0   0   0   0
0   0   0   0
0   0   0   0
*/

class Pattern {

    public static void main(String[] args) {
        
        for(int i = 1; i <= 16; ++i) {

            if(i % 4 == 0) {
                
                System.out.println(0 + "\t");
            }
            else {

                System.out.print(0 + "\t");
            }
        }
    }
}