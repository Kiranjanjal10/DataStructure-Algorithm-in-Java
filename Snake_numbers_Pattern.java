public class Snake_numbers_Pattern {
    public static void main(String[] args) {
        
        int n = 5; // size of the grid
        int num = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                // Odd row - print left to right
                for (int j = 1; j <= n; j++) {
                    System.out.print(num + " ");
                    num++;
                }
            } else {
                // Even row - print right to left
                int temp = num + n - 1;
                for (int j = 1; j <= n; j++) {
                    System.out.print(temp + " ");
                    temp--;
                }
                num += n;
            }
            System.out.println();
        }
    }
}
