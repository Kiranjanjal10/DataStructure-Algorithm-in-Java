public class IFElseLadder {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        
        if (n > 0) {
            System.out.println("number is positive");
        } else if (n < 0) {
            System.out.println("number is negative");
        } else if (n == 0) {
            System.out.println("number is zero");
        } else {
            System.out.println("Invalid input");
        }
        
        sc.close();
    }
}
