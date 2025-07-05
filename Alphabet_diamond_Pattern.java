public class Alphabet_diamond_Pattern {
    public static void main(String[] args) {
        
        int n = 5; // Height of the top half

        // Top half
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Print increasing letters
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }

            // Print decreasing letters
            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch);
            }

            System.out.println();
        }

        // Bottom half
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Print increasing letters
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }

            // Print decreasing letters
            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}
