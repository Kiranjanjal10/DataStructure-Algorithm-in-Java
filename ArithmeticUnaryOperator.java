import java.util.Scanner;
public class ArithmeticUnaryOperator {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number :");
        int A=sc.nextInt();
        System.out.println("Enter the Second Number :");
        int B=sc.nextInt();
     
        int C=++A;
        int D=A++;
        
        int E=--B;
        int F=B--;

        System.out.println("Pre-Increment "+C);
        System.out.println("Pre-Decrement "+E);
        System.out.println("Post- Increment :"+D);
        System.out.println("Post- Drecrement :"+F);
        
    }
}
