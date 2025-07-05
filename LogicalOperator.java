import java.util.*;
public class LogicalOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number :");
        int A=sc.nextInt();
        System.out.println("Enter the Second Number :");
        int B=sc.nextInt();
        
        System.out.println((A>B)&&(A==B));
        System.out.println((A>B)||(B<A));
        
    } 
}
