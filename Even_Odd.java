import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int evensum=0;
        int oddsum=0;
        System.out.println("Enter no to get input:");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            if(i%2==0)
            {
                evensum=evensum+i;
            }
            else
            {
                oddsum=oddsum+i;
            }
        }
        System.out.println("Even No sum :"+evensum);
        System.out.println("Odd No Sum :"+oddsum);
    }
}
