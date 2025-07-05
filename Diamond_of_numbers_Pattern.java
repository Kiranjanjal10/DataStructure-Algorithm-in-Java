public class Diamond_of_numbers_Pattern {
    public static void main(String[] args) {
        
        int n = 5;

        // Top half including middle line
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Print descending numbers from i down to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Print ascending numbers from 2 up to i
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        // Bottom half
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Print descending numbers from i down to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Print ascending numbers from 2 up to i
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
