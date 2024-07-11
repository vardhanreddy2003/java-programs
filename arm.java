import java.util.Scanner;
import java.lang.Math;

public class arm {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=(int)Math.log10(n)+1;
        int sum=0;
        int t=n;
        while(n>0)
        {
            int r=n%10;
            int k=1;
            for(int i=0;i<c;i++)
            {
            
                k=k*r;
            }
            
            sum=sum+k;
            n=n/10;
        }
        System.out.println(sum==t);
        s.close();

    }
    
}
