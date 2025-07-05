public class Pattern17 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++)//for first half pattern 
        {
            for(int s=1;s<=n-i;s++)
            {
                System.out.print(" "); // for space's
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"); // for 1st triangle 
            }
            for(int j=i-1;j>=1;j--)
            {
                System.out.print("*"); // for 2nd Triangle 
            }
            System.out.println();

        }


        for(int i=n;i>=1;i--)//for second half pattern 
        {
            for(int s=1;s<=n-i;s++)
            {
                System.out.print(" "); // for space's
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"); // for 1st triangle 
            }
            for(int j=i-1;j>=1;j--)
            {
                System.out.print("*"); // for 2nd Triangle 
            }
            System.out.println();

        }
    }
}
