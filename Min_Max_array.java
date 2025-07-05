public class Min_Max_array {
    public static void main(String[] args) {
        int[] arr = { 3, 7, 2, 9, 4 };
        int max = arr[0], min = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }
        System.out.println("Max: " + max + ", Min: " + min);
    }
}
