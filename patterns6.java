public class patterns6 {
    public static void main(String[] args)
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            int d=i+1;
            for(int j=0;j<d;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
