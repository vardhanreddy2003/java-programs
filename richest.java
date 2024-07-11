import java.util.Scanner;

public class richest {
    static int rich(int [][] a)
    {
        int n=0;
        for(int i=0;i<a.length;i++)
        {
            int sum=0;
            for(int j=0;j<a[i].length;j++)
            {
                sum+=a[i][j];
            }
            if(sum>n)
            {
                n=sum;
            }
        }
        return n;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int[][] a=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=s.nextInt();

            }
        } 
        System.out.println(rich(a));  
        s.close();     
    }
}
