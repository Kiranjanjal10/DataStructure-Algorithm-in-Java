import java.util.Scanner;

public class HollowRec {
    public static void hollow_rec(int row,int col)
    {    //outer loop
        for(int i=1;i<=row;i++)
        {     //Inner loop
            for(int j=1;j<=col;j++)
            {
                if(i==1||i==row||j==1||j==col)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No of Rows :");
        int Rown=sc.nextInt();
        System.out.println("Enter the No of Colums :");
        int Coln=sc.nextInt();
        hollow_rec(Rown,Coln);
    }
}
