import java.util.Scanner;

public class d2arraybinary {
    static int re(int[][] a,int n)
    {
        int i=0;
        int j=a.length-1;
        while(i<a.length && j>=0)
        {
            if(a[i][j]== n)
            {
                return n;
            }
            else if(a[i][j]<n)
            {
                i++;
            }
            else 
            {
                j--;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int[][] a=new int [4][4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        int n=s.nextInt();
        System.out.println(re(a,n));
        s.close();

    }
    
    
}
