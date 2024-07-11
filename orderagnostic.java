import java.util.Scanner;

public class orderagnostic {
    static int order(int[] a,int s)
    {
        int i=0;
        int j=a.length-1;
        int b=0;
        if(a[i]<a[j])
        {
          b=0;
        }
        else{
            b=1;
        }
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(a[mid]==s) 
            {
                return mid;
            }
            if(b==1)
            {
            if(a[mid]<s)
            {
                j=mid-1;
            }
            if(a[mid]>s)
            {
                i=mid+1;
            }
        }
        else{
            if(a[mid]>s)
            {
                j=mid-1;
            }
            if(a[mid]<s)
            {
                i=mid+1;
            }

        }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int se=s.nextInt();
        int[] a=new int[5];
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        int b=order(a,se);
        System.out.println(b);
        s.close();
    }
    
}
