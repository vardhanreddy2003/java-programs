import java.util.Scanner;



public class perfect {
    static int re(int n)
    {
        int sum=1+n/2;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                sum+=i;
        }
        }
        return sum;
    }
    static  String  pronic(int n)
    {
        for(int i=1;i<=(n/2);i++)
        {
            if((i*(i+1))==n)
            {
                return "pronic";
            }
        }
        return "not pronic";
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(re(n)==n)
        {
            System.out.println("perfect");
        }
        else if(re(n)<n)
        {
            System.out.println("defiecient");
        }
        else 
        {
            System.out.println("Abundant");
        }
       s.close(); 
       System.out.println(pronic(n));
    }
}
