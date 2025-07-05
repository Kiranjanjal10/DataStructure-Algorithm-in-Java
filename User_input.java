import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        int a= sc.nextInt();
           int b= sc.nextInt();
           System.out.println("Sum of two numbers is: "+(a+b));
       }

    }
}
