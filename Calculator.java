import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st No :");
        int no1 = sc.nextInt();
        System.out.println("Enter 2nd No :");
        int no2 = sc.nextInt();
        System.out.println("Choose an Operator(+,-,/,*,%) :");
        char ch = sc.next().charAt(0);
        double result = 0.0d;

        switch (ch) {
            case '+':
                result = no1 + no2;
                break;
            case '-':
                result = no1 - no2;
                break;
            case '*':
                result = no1 * no2;
                break;
            case '/':
                result = no1 / no2;
                break;
            case '%':
                result = no1 % no2;
                break;
            default:
                System.out.println("Enter valid Operator ");
                return;

        }
        sc.close();
        System.out.println(no1 + " " + ch + " " + no2 + " = " + result);
    }

}
