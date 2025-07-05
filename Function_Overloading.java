public class Function_Overloading {
    public static int sum(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
  public static int sum(int a,int b, int c)
    {
        int sum=a+b+c;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(45,56));
        System.out.println(sum(56,67,78));
    }
}
