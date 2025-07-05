public class BinaryToDecimal {
    public static void BinToDec(int n)
    { 
        int mynum=n;
        int pow=0;
        int decNo=0;
        while(n>0)
        {
            int rem=n%10;
            decNo=decNo+(rem*(int)Math.pow(2, pow));
            pow++;
            n=n/10;

        }
        System.out.println("Binary no "+mynum+" to Decila is :"+decNo);
    }
    public static void main(String[] args) {
        BinToDec(101);
    }
}
