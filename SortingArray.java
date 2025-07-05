import java.util.Arrays;
public class SortingArray {
    public static void main(String[] args) {

        System.out.println("---------Sorting Double array -------");
        double[] array1={2.3,11.0,4.6,-3.6,0.8,12};
        System.out.println(" Unsortd Array  :"+Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println(" sortd Array  :"+Arrays.toString(array1));

        System.out.println("------------Sorting int Array--------");
        int[] array2={3,1,67,90,2,3};
        System.out.println("Unsorted Array :"+Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted Array :"+Arrays.toString(array2));

        System.out.println("------------Sorting Char Array--------");
        char[] array3={'F','B','b','a','Z'};
        System.out.println("Unsorted Array :"+Arrays.toString(array3));
        Arrays.sort(array3);
        System.out.println("Sorted Array :"+Arrays.toString(array3));

        System.out.println("------------Sorting String  Array--------");
        String[] array4={"cat","Dog","Monkey","Lion","elephant","Cow"};
        System.out.println("Unsorted Array :"+Arrays.toString(array4));
        Arrays.sort(array4);
        System.out.println("Sorted Array :"+Arrays.toString(array4));
        
        System.out.println("------------Sorting String  Array 2 --------");
        String[] array5={"3","300","20","35","37","31","4","70","ant","Zebra"};
        System.out.println("Unsorted Array :"+Arrays.toString(array5));
        Arrays.sort(array5);
        System.out.println("Sorted Array :"+Arrays.toString(array5));
        


    }
}
