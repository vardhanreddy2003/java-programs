import java.util.Scanner;

public class splendid {
    static int sum(int n)
    {
        int sum=0;
        while(n>0)
        {
            int r=n%10;
            sum+=r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>9)
        {
            while(a>9)
            {
                a=sum(a);
            }
        }
        System.out.println(a);
        s.close();
        
    }    
}
