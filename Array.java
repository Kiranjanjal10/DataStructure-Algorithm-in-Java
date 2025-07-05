public class Array {
    public static void main(String[] args) {
        int[]numbers;
        numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;    
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        System.out.println("SUM:"+ (numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4]));
        int []number={4,6,-3,-2};
        number[1]=12;
        System.out.println("----------");
        System.out.println("New Sum :"+ (number[0] + number[1] + number[2] + number[3]));

    }
}
