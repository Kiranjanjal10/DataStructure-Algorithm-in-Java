public class Hollow_right_triangle_Pattern
{
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // Print star for first column, last column of current row, and last row
                if (j == 1 || j == i || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}