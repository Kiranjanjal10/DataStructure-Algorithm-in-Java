public class Alphabet_triangle_Pattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // Print characters starting from 'A'
                System.out.print((char)('A' + j - 1));
            }
            System.out.println();
        }
    }
}
