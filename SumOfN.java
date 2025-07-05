import java.util.Scanner;
public class SumOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        int sum=0;
        int i;
        for(i=0;i<=n;i++)
        {
            sum=sum+i;

        }
        System.out.println("Sum of "+n+" Number : "+sum);

    }
}
