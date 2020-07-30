class Toggle_Charachter {
    
    public static void main(String[] args) {
        
        char ch = 'A';
        char ch1 = 'a';
        int tempch, tempch1;

        tempch = (int) ch;
        tempch += 32;
        ch = (char) tempch;

        tempch1 = (int) ch1;
        tempch1 -= 32;
        ch1 = (char) tempch1;

        System.out.println("capital A converted into small a : " + ch);
        System.out.println("small a converted into capital A : " + ch1);
    }
}