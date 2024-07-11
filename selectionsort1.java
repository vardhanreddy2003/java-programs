import java.util.Scanner;

public class selectionsort1 {
    static void sort(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int  j=i+1;j<a.length;j++)
            {
                if(a[j]>a[i])
                {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }

            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        sort(a);
    s.close();
    }
}
