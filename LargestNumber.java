public class LargestNumber {

    public static int getLargest(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int num[] = { 10, 20, 30, 50, 60, 70, 80 };
        int largest = getLargest(num);
        System.out.println("Largest No of Array is :" + largest);
    }
}
