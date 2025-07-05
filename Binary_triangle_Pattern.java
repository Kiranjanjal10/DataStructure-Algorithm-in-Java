public class Binary_triangle_Pattern {
    public static void main(String[] args) {
        
        int n = 4; // Number of rows

        for (int i = 1; i <= n; i++) {
            int val = (i % 2 == 0) ? 0 : 1; // Start with 0 for even rows, 1 for odd rows
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val = 1 - val; // Toggle between 0 and 1
            }
            System.out.println();
        }
    }
}
