public class Rhombus_pattern {
    public static void main(String[] args) {
        
        int n = 5; // Size of the rhombus

        for (int i = 1; i <= n; i++) {
            // Print leading spaces to shift stars to the right
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
