public class Call_by_Value {
    public static void SwapFun(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After  Swap : a = "+a+" b = "+b);
    }
    public static void main(String[] args) {
        int a=5;
        int b=10;
        System.out.println("Before Swap : a = "+a+" b = "+b);
        SwapFun(a, b);
        
    }
}
