public class Pascals_Triangle_with_spacin_Pattern {
    public static void main(String[] args) {
        
        int n = 5; // Number of rows

        for (int i = 0; i < n; i++) {
            // Print leading spaces for centering
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print("  ");
            }

            int val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val + "   "); // spacing between numbers

                // Calculate next value in row using binomial coefficient formula
                val = val * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
