public class MedianOfSortedArrays {
    public static double findMedian(int[] a, int[] b) {
        int n = a.length, m = b.length;
        int[] merged = new int[n + m];
        int i = 0, j = 0, k = 0;

        // Merge arrays
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                merged[k++] = a[i++];
            } else {
                merged[k++] = b[j++];
            }
        }

        // Add remaining elements
        while (i < n) merged[k++] = a[i++];
        while (j < m) merged[k++] = b[j++];

        // Find median
        int total = n + m;
        if (total % 2 == 1) {
            return merged[total / 2];
        } else {
            return (merged[total / 2 - 1] + merged[total / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 4};
        System.out.println("Median: " + findMedian(nums1, nums2));
    }
}
