public class Pattern15 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) { // for 1st half of pattern
            for (int j = 1; j <= i; j++) {// for print 1st triangle
                System.out.print(j);
            }
            for (int k = 1; k <= (2 * (n - i)); k++) { // for print space's 
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { // for print 2nd triangle 
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = n; i >=1; i--) { // for 2st half of pattern
            for (int j = i; j>=1; j--) {// for print 1st triangle
                System.out.print(j);
            }
            for (int k = 1; k <= (2 * (n - i)); k++) { // for print space's
                System.out.print(" ");
            }
            for (int j = i; j>=1; j--) { // for print 2nd triangle 
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
