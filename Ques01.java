public class Ques01 {
    public static boolean Simple(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true; // Found a duplicate
                }
            }
        }
        return false; // No duplicates
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 1 };
        System.out.println("output :" + Simple(array));
    }
}
