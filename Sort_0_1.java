import java.util.Arrays;

public class Sort_0_1 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 0, 1, 1 };
        int count0 = 0;
        for (int num : arr) {
            if (num == 0)
                count0++;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i < count0 ? 0 : 1;
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));

    }
}
