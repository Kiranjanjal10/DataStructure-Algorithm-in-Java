import java.util.*;
public class Averageofthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number :");
        int no1=sc.nextInt();
        System.out.println("Enter Second Number :");
        int no2=sc.nextInt();
        System.out.println("Enter Third Number :");
        int no3=sc.nextInt();
        int average3=(no1+no2+no3)/3;
        System.out.println("Average of "+no1+" "+no2+" "+no3+" :"+average3) ;

    }
}
