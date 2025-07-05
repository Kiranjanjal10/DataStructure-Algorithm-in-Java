public class Array01 {
    public static void ArrayFun(int no[],int nonchange)
    {  
        nonchange=10;
        for(int i=0;i< no.length;i++)
        {
            no[i] =no[i]+1; // Assigning values to the arra
        }
    }
    public static void main(String[] args) {
        int no[] = {10,20,30};
        int nonchange=5;
         ArrayFun(no,nonchange);
        for(int i=0;i<no.length;i++)
        {
            System.out.println(no[i]);
        }
        System.out.println(nonchange);
    }
}
