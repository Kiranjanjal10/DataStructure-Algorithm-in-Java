public class Zigzag_pattern {
    public static void main(String[] args) {
        
        int n = 9; // Total columns

        for (int i = 1; i <= 3; i++) {  // 3 rows fixed for zigzag
            for (int j = 1; j <= n; j++) {
                // Conditions for printing stars in zigzag pattern
                if (((i + j) % 4 == 0) || (i == 2 && j % 4 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
