public class patterns {
    public static void  main(String[] args )
    {
        int n=5;
        for(int row=0;row<2*n;row++)
        {
            int d=row>n?2*n-row-1:row;
            
            for(int col=0;col<d;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
