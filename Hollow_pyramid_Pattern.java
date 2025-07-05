public class Hollow_pyramid_Pattern {
    public static void main(String[] args) {
        
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces inside the pyramid
            for (int j = 1; j <= 2 * i - 1; j++) {
                // Print star at the first, last or bottom row positions
                if (j == 1 || j == 2 * i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
