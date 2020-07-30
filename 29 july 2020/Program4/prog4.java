class Divisibility {
    
    static boolean isDivisible(int dividend) {

        if (dividend % 2 == 0) {
   
            return true;
        } else {

            return false;
        }            
    }

    public static void main(String[] args) {
        
        Divisibility div = new Divisibility();
        boolean res = Divisibility.isDivisible(8);

        if (res == true) {

            System.out.println("Yes, it is divisible");
        } else {

            System.out.println("No, it is not divisible");
        }
    }
}