import java.util.Scanner;

public class bubblesort {
    static void sort(int a[])
    {
       int  j=0;
       int c=0;
        while(j<a.length-1)
        {
            for(int i=0;i<a.length-j-1;i++)
            {
                 c=0;
                if(a[i]>=a[i+1])
                {
                    int t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
                    c++;
                }
                
                
            }
            if(c==0)
            {
                break;
            }
            j++;
        }

        for(int k=0;k<a.length;k++)
        {
            System.out.print(a[k]);
        }
        
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
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
