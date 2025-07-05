public class LinearSearch {
    public static int linearSearch(int[] num, int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {

                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num = { 3, 4, 2, 5, 6, 7, 8, 9, 12, 34, 56, 78, 90 };
        int key = 56;
        int index = linearSearch(num, key);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

}
