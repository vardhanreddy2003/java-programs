import java.util.Scanner;

public class maxarray {
    static int sort(int[] a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>sum)
            {
                sum=a[i];
            }
        }
        return sum;
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
        int c=sort(a);
        System.out.println(c);
        int k=s.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]+k>=c)
            {
                System.out.println("1");

            }
            else{
                System.out.println("0");
            }
        }
        s.close();

        
    }
    
}
