public class Pattern7 {
    public static void main(String[] args) {
        int n=3;int m=4;
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                System.out.print(num+"\t");
                num=num+1;
            }
            System.out.println();
        }
    }
}
