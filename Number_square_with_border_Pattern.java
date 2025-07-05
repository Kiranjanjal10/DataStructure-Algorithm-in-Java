public class Number_square_with_border_Pattern {
    public static void main(String[] args) {
        
        int n = 4; // Maximum number at the border (side = 2n - 1)

        int size = 2 * n - 1; // Total number of rows and columns

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int min = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                System.out.print((n - min));
            }
            System.out.println();
        }
    }
}
