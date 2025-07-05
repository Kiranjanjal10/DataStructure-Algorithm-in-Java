import java.util.Scanner;

public class DecimalToBInary {
    public static void DecToBin(int n)
    {   
        int mynum=n;
        int pow=0;
        int binNo=0;
        while(n>0)
        {
            int rem=n%2;
            binNo=binNo+(rem * (int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("Decimal "+mynum+"To Binary :"+binNo);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Decimal No :");
        int n=sc.nextInt();
        DecToBin(n);
    }
}
