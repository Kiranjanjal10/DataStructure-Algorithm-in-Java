public class Alphabet_pyramid_Pattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // Print ascending letters from A
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
            }

            // Print descending letters after the peak
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char)('A' + j));
            }

            System.out.println();
        }

    }
}
