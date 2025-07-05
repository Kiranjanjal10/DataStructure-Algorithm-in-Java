import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        printMultiplicationTable(5);

}

    private static void printMultiplicationTable(int number) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
    }

