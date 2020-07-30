class Even_Odd {

    static int isEven(int num) {

        if (num % 2 == 0) {

            return 1;
        } else {

            return 0;
        }
    }
    public static void main(String[] args) {
        
        Even_Odd check = new Even_Odd();
        int res = isEven(100);
        if (res == 1) {
            
            System.out.println("Even");
        } else {

            System.out.println("Odd");
        }
    }
}