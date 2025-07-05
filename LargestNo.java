import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter theree Numbers :");
        int n1, n2, n3;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        int largest;

        if (n1 >= n2) {
            if (n1 >= n3) {
                largest = n1;
            } else {
                largest = n3;
            }
        } else {
            if (n2 >= n3) {
                largest = n2;
            } else {
                largest = n3;
            }
        }
        System.out.println("Largest no is :" + largest);
        sc.close();
    }
}
