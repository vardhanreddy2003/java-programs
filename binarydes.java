import java.util.Scanner;

public class binarydes {
    static int search(int a[],int s)
    {
        int i=0;
        int j=a.length-1;
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(a[mid]==s) 
            {
                return mid;
            }
            if(a[mid]<s)
            {
                j=mid-1;
            }
            if(a[mid]>s)
            {
                i=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int[] a=new int[5];
        int se=s.nextInt();
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        int b=search(a,se);
        System.out.println(b);
        s.close();
    }
    
}
