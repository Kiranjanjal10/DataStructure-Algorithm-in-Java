public class Hourglass_Pattern {
    public static void main(String[] args) {
        
        int n = 5; // Number of rows in the top half (including middle)

        // Top half of the hourglass
        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            // Print stars
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom half of the hourglass
        for (int i = 2; i <= n; i++) {
            // Print leading spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            // Print stars
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
