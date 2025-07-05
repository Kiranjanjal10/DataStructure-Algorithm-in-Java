import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class InbuiltReverse {
    public static void printarray(Integer ar[]) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(arr, Collections.reverseOrder());
        printarray(arr);
    }
}
