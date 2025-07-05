public class Hollow_square_Pattern {
    public static void main(String[] args) {
        
        int n = 5;  // Size of the square

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print stars on the borders, spaces inside
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
