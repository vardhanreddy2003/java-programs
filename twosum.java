import java.util.Scanner;

public class twosum {
    static void sum(int[] a,int k)
    {
        int c=0;
        int d=0;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[i]+a[j]==k)
                {
                    c=i;
                    d=j;
                }
            }
            if(c!=0 && d!=0)
            {
                break;
            }
        }
        System.out.println(c);
        System.out.println(d);

        
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int k=s.nextInt();
        sum(a,k);
        s.close();
    }
    
}
