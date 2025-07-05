public class Cross_X_pattern {
    public static void main(String[] args) {
        
        int n = 7; // Must be an odd number for symmetric cross

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print star when on either diagonal
                if (j == i || j == n - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
