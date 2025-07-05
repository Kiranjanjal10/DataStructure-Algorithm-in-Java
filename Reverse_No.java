public class Reverse_No {
    public static void main(String[] args) {
        int n=123456789;
        while(n>0)
        {
            int lastdigit=n%10;
            System.out.print(lastdigit);
            n=n/10;
        }
        System.out.println();
    }
}
