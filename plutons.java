import java.util.Scanner;

public class plutons {
    static void plus(int[] a)
    {
        int p=0;
        for(int i=0;i<a.length;i++)
        {
            p=(p*10)+a[i];
        }
        p=p+1;
        int sum=0;
        while(p>0)
        {
            int r=p%10;
            sum=(sum*10)+r;
            p=p/10;
        }
        while(sum>0)
        {
            int r=sum%10;
            System.out.println(r);
            sum=sum/10;
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
        plus(a);
        s.close();
    }
    
}
