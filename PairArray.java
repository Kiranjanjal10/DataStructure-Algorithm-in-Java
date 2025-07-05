public class PairArray {

    public static void printPair(int num[]) { // time Complexity O(n 2)
        int tp = 0;
        for (int i = 0; i < num.length; i++) {
            int curr = num[i];
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + curr + "," + num[j] + ") ");
                tp++;

            }
            System.out.println();
        }
        System.out.println("Total Pairs : " + tp); // formula (n*(n-1)/2)
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        printPair(number);
    }
}
