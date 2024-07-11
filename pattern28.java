public class pattern28 {
    public static void main(String[] args)
    {
    int n=5;
    for(int row=0;row<2*n;row++)
    {
        int d=row>n?2*n-row-1:row;
        int e=n-d;
        for(int col=0;col<e;col++)
        {
            System.out.print(" ");
        }
        
        for(int col=0;col<d;col++)
        {
            System.out.print("* ");
        }
        System.out.println();

    }
}
}
