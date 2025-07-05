import java.util.Scanner;

public class AvgofThree {
    public static void Averga(int a,int b,int c )
    {
        int avg=(a+b+c)/3;
        System.out.println("Average of three numbers is: "+avg);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter Second number :");
        int b=sc.nextInt();
        System.out.println("Enter Third number :");
        int c=sc.nextInt();
        Averga(a,b,c);
    }
}
