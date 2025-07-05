public class SmallestNumber {
    public static int getSmallest(int num[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int num[] = { 19, 45, 6, 4, 35, 78, 2, 9 };
        int small = getSmallest(num);
        System.out.println("Smallest Value in Array:" + small);

    }
}
