import java.util.*;
public class RelationalOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number :");
        int A=sc.nextInt();
        System.out.println("Enter the Second Number :");
        int B=sc.nextInt();

        if(A==B)
        {
            System.out.println("Both "+A+" & "+B+" Equal");
        }
        else
        {
            System.out.println("Both "+A+" & "+B+" not Equal");
        }

        if(A!=B)
        {
            System.out.println(A+" is not equal to "+B);
        }
        else
        {
            System.out.println(A+" is  equal to "+B);
        }
       
        if(A>B)
        {
            System.out.println(A+" Greater than "+B);
        }
        else
        {
            System.out.println(A+" Not Greater than "+B);
        }
        if(A<B)
        {
            System.out.println(A+" less than "+B);
        }
        else
        {
            System.out.println(A+"  not less than "+B);
        }
        if(A>=B)
        {
            System.out.println(A+" Greater than and equal  "+B);
        }
        else
        {

            System.out.println(A+" Not Greater than and equal  "+B);
        }
        if(A<=B)
        {
            System.out.println(A+" less than and equal  "+B);
        }
        else
        {
            System.out.println(A+" Not Less than and equal  "+B);
        }

    }
}

