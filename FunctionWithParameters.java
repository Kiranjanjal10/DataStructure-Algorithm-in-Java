import java.util.Scanner;

public class FunctionWithParameters {
    public static int addTwo(int a, int b)
    {
        int c=a+b;
        return c;
        
    }
    public static void main(String[] args)  {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the value of a:");
            int a = scanner.nextInt();
            System.out.println("Enter the value of b:");
            int b = scanner.nextInt();
            int sum =addTwo(a,b);
            System.out.println("Sum of a and b is: "+sum);
        }
    }
}
