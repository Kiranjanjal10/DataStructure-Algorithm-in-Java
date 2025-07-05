public class MaxSubArray {
    public static int MaxSub(int array[]) {
        int currsum = 0;
        int msxsum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int start = i;
            for (int j = i; j < array.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    currsum += array[k];
                }
                System.out.println(currsum);
                if (msxsum < currsum) {
                    msxsum = currsum;
                }

            }
            System.out.println();
        }
        return msxsum;
    }

    public static void main(String[] args) {
        int array[] = { 1, -2, 6, -1, 3 };
        int max = MaxSub(array);
        System.out.println("Maximum SubArray:" + max);
    }
}
