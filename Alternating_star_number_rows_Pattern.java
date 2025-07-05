public class Alternating_star_number_rows_Pattern {
    public static void main(String[] args) {
        int rows = 4;  // total number of rows
        int cols = 5;  // number of stars or numbers in each row

        for (int i = 1; i <= rows; i++) {
            if (i % 2 != 0) {
                // Odd rows: print stars
                for (int j = 1; j <= cols; j++) {
                    System.out.print("* ");
                }
            } else {
                // Even rows: print numbers
                for (int j = 1; j <= cols; j++) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
