import java.util.Scanner;

public class miracle {
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
    static int reverse(int n)
    {
        int rev=0;
        while(n>0)
        {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }
     public static void main(String[] args)
    {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        if(reverse(n)%sum(n)==0)
        {
            System.out.println("miracle integer");

        }
        else{
            System.out.println("not miracle integer");

        }
s.close();
    }
}

    


    

