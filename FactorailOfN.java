import java.util.Scanner;

public class FactorailOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to get Factoral : ");
        int n=sc.nextInt();
        int result=factorail(n);
        System.out.println("Factorial of "+n+" is :"+result);
    }
    public static int factorail(int n) {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
}
