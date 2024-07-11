import java.util.Scanner;

public class cyclicsort {
    static void sort(int[] a)
    {
        int i=0;
        while(i<a.length)
        {
            int c=a[i]-1;
            if(a[i]!=a[c])
            {
                int t=a[i];
                a[i]=a[c];
                a[c]=t;
            }else{
                i++;
            }
        }
        for(int j=0;j<a.length;j++)
        {
            System.out.println(a[j]);
        }
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
        sort(a);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]);
        }

      s.close();  
    }
    
}
