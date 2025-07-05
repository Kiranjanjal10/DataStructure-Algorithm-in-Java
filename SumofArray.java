public class SumofArray {
    public static void main(String[] args) {
        int sum = 0;
        int array[] = { 1, 2, 3, 4, 5 };
        for (int i : array) {
            sum = sum + i;
        }
        System.out.println("Sum of array is :" + sum);
    }
}
