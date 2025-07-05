import java.util.Scanner;

public class SumOfDigit {
    public static void SumDigit(int n) {
    int sum = 0;
    int mynum = n;

    while (n > 0) {
        int rem = n % 10;     // get last digit
        sum = sum + rem;      // add it to sum
        n = n / 10;           // remove last digit
    }

    System.out.println("Sum of " + mynum + " is: " + sum);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        System.out.println("Enter the Number to Calculate Sum :");
        int n=sc.nextInt();
        SumDigit(n);
    }
}
