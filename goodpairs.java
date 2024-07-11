import java.util.Scanner;

public class goodpairs {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println(good(a));
        s.close();
    }
    static int good(int[] a)
    {
        int c=0;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
        {
            if(a[i]==a[j])
            {
                c+=1;
            }
        }
        }
        return c;
    }
}
