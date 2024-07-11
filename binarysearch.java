import java.util.Scanner;

public class binarysearch {
    static int bisearch(int a[],int k)
    {
        int l=0;
        int h=a.length-1;
        int m=(l+h)/2;
        while(true)
        {
            m=(l+h)/2;
            if(a[m]==k)
            {
                return a[m];
            }
            if(a[m]>k)
            {
                h=m-1;
            }
            if(a[m]<k)
            {
                l=m+1;
            }
            if(l>h)
            {
                return a[l];
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
        a[i]=s.nextInt();
        }
        int m=bisearch(a,k);
        if(m==-1)
        {
            System.out.println("element not present");
        }
        else{
            System.out.println(m);
        }
        s.close();
    }    
}
