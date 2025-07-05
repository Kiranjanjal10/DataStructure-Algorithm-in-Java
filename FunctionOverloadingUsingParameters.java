public class FunctionOverloadingUsingParameters {
   public static void main(String[] args) {
    
    System.out.println(sum(3, 5));
    System.out.println(sum(2, 3,3));
   }
     public static int sum(int a,int b)
     {
        return a+b;
     }
     public static int sum(int a,int b, int c)
     {
        return a+b+c;
     }
}
