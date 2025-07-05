import java.util.*;

public class SumofEven {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = sc.nextInt();

        for (int i = 0; i <= num; i += 2) {
            sum = sum + i;
            System.out.print(i + " ");

        }
        System.out.println("Sum of Even No is :" + sum);
    }
}
