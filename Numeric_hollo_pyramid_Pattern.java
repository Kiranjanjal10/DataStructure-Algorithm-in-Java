public class Numeric_hollo_pyramid_Pattern {
    public static void main(String[] args) {
        
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // Print numbers and spaces inside
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  "); // two spaces for alignment
                }
            }

            System.out.println();
        }
    }
}
