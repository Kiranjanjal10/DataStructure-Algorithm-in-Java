public class Pascals_Triangle_Pattern {
    public static void main(String[] args) {
        int n = 5; // number of rows

        for (int i = 0; i < n; i++) {
            // Print leading spaces for centering
            for (int space = 1; space <= n - i - 1; space++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); // Compute next binomial coefficient
            }

            System.out.println();
        }
    }
}
