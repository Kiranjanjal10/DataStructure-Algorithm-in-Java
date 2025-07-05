public class SelectionSort {

    public static void selectSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;

        }
    }

    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 1, 2, 4 };
        selectSort(arr);
        printarray(arr);
    }
}
