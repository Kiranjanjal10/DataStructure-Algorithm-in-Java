public class First_Non_Repeating_Element {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 4, 2, 3, 5, 1 };
        for (int i = 0; i < arr.length; i++) {
            boolean unique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println("First non-repeating: " + arr[i]);
                break;
            }
        }

    }
}
