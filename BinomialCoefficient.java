import java.util.Scanner;

public class BinomialCoefficient {
     
    public static int factorial(int n)
    {
        int f=1;
     for(int i=1;i<=n;i++)
     {
        f=f*i;
     }
     return f;
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of N :");
        int n=sc.nextInt();
        System.out.println("Enter the Value of R :");
        int r=sc.nextInt();
        int result = binCoeff(n, r);
        System.out.println("Binomial Coefficient of "+n+" and "+r+" is :"+result);
    }
    public static int binCoeff(int n, int r) {
        int a=factorial(n);
        int b=factorial(r);
        int c=factorial(n-r);
        return a/(b*c);

    }

}
