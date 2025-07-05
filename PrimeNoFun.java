import java.util.Scanner;

public class PrimeNoFun {
    // public static boolean isPrime(int n) {
    //     if(n==2)
    //     {
    //         return true;
    //     }
    //     boolean isprime=true;
    //     for(int i=2;i<=n-1;i++)
    //     {
    //         if(n%i==0)
    //         {
    //             isprime=false;
    //             break;
    //         }
    //     }
    //     return isprime;
    // } 

    public static boolean isPrime(int n)
    {
        if(n==2)
        {
            return true;
        } 
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to Check No is prime or Not :");
        int n=sc.nextInt();
        System.out.println(isPrime(n));
    }

} 

