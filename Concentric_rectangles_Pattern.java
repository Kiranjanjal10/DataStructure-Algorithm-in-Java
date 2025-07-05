public class Concentric_rectangles_Pattern {
    public static void main(String[] args) {
        
        int n = 4; // Highest number in the outermost rectangle
        int size = 2 * n - 1; // Size of the square grid

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int min = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                System.out.print(n - min);
            }
            System.out.println();
        }
    }
}
