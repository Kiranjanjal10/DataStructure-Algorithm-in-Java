public class Check_array_Sorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        System.out.println("Is sorted: " + sorted);

    }
}
