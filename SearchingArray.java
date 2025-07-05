import java.util.Arrays;

public class SearchingArray {
    public static void main(String[] args) {
        int[] number={0,12,4,16,18,10};
        int indexofEight=Arrays.binarySearch(number, 8);
        System.out.println("Index of 8 :"+indexofEight);

        int indexofseven=Arrays.binarySearch(number, 7);
        System.out.println("index of 7 :"+indexofseven);

        Arrays.sort(number);

        int indexoffour=Arrays.binarySearch(number, 4);
        System.out.println("index of 4 :"+indexoffour);

        String[] animal ={"Cat","Cow","Dog","Elephant","Lion","Monkey"};
        int indexDog=Arrays.binarySearch(animal,"Dog");
        System.out.println("Index of Dog :"+indexDog);

        int indexAnt=Arrays.binarySearch(animal, "Ant");
        System.out.println("index of Ant :"+indexAnt);

    }
}
