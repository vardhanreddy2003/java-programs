public class pattern5 {
    public static void main(String[] args)
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
        int s=n-i-1;
        for(int j=0;j<s;j++)
        {
        System.out.print(" ");
        }
        for(int j=0;j<=i;j++)
        {
        System.out.print("* ");
        }
        System.out.println();

        }
    }
    
}
