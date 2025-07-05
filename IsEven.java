import java.util.Scanner;

public class IsEven {
    public static int isEven(int n) {
        int  check=0;
        if (n % 2 == 0) {
            check=1;
        }
        else
        {
            check=0;
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int result=isEven(n);
        if(result==1)
        System.out.println("True");
        else
        System.out.println("False");
    }
}
