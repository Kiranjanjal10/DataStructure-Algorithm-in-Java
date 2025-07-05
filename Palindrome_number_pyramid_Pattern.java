public class Palindrome_number_pyramid_Pattern {
    public static void main(String[] args) {
        
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // Print ascending numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print descending numbers from i-1 to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
