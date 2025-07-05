public class Sum1 {
        public static void main(String[] args) {
            int a = 1; // Example input
            int b = 2; // Example input
            int result = getSum(a, b);
            System.out.println("The sum of " + a + " and " + b + " is: " + result);
        }
    
        public static int getSum(int a, int b) {
            while (b != 0) {
                // Calculate carry
                int carry = a & b;
                // Calculate sum without carry
                a = a ^ b;
                // Shift carry to the left
                b = carry << 1;
            }
            return a;
        }
    
}
