import java.util.Arrays;
public class array1 {
    public static void main(String[] args) {
        int[] numberArray; // declaration

        numberArray =new int[5]; //initialition

        numberArray[0]=5;
        numberArray[1]=56;
        numberArray[2]=-5;
        numberArray[3]=23;
        numberArray[4]=56;
        // numberArray[5]=10;

        int result=numberArray[0]+numberArray[1]+numberArray[3]+numberArray[4];

        // System.out.println("Simple array :"+numberArray); not print array print garbag value insted of array elements 
        System.out.println("Result :"+result);
        System.out.println("Numberarray "+Arrays.toString(numberArray));
        System.out.println("Array Length :"+numberArray.length);

        int[] numberArray2={5,56,-5,23,56};
        System.out.println("before  Altering :"+Arrays.toString(numberArray2));
        numberArray2[3]=8;
        System.out.println("After altering :"+Arrays.toString(numberArray2)); 
        // numberArray2.length=8; can not dyanamic change size of array 
        int ages[]=new int[]{15,(int)16.5,17}; 
        System.out.println("Ages :"+Arrays.toString(ages));

        Object[] mixedArray={3,5,6.7,'A',"Kiran",false};
        System.out.println("Mixed Array :"+Arrays.toString(mixedArray));


    }
}
