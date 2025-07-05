public class Butterfly_with_numbers_Pattern {
    public static void main(String[] args) {
        
        int n = 4;

        // Upper part
        for (int i = 1; i <= n; i++) {
            // Left increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Spaces in the middle
            int spaces = 2 * (n - i);
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            // Right decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        // Lower part
        for (int i = n - 1; i >= 1; i--) {
            // Left increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Spaces in the middle
            int spaces = 2 * (n - i);
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            // Right decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
