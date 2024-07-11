import java.util.Scanner;

public class mountainarray {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
       int  n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int st=0;
        int e=n-1;
        while(st<e)
        {
            int m=(st+e)/2;
            if(a[m]<a[m+1])
            {
                st=m+1;
            }
            if(a[m]>a[m+1])
            {
                e=m;
            }
            if(st>=e)
            {
                System.out.println(a[st]);
            }
        }
        s.close();
    }
    
}
