import java.util.Scanner;

public class getfinalsum {
    static int sum(int n)
    {
        int r=0,sum=0;
        while(n>0)
        {
            r=n%10;
            sum+=r;
            n=n/10;
        }
        return sum;
    }
    static int factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>9)
        {
            if(n>9)
            {
                n=sum(n);
            }
        }
        System.out.println(n);
        System.out.println(factorial(n));
        s.close();
        
    }
    
}
