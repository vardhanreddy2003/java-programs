import java.util.Scanner;
public class prime {
    static int p(int n)
    {
        int count=0;
        if(n==1 ||n==0)
        {
            return  -1;
        }
        else
        {
       for(int i=2;i<n;i++)
       {
        if(n%i==0)
        {
            count=1;
            break;
        }
    
       }
       return count;
    }

    }

    static int leapyear(int n)
    {
      if(n%400==0 ||(n%4==0 &&n%100!=0))
        {
            return 1;
        }
    else
    {
        return 0;
    }
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
     static int harshad(int n)
     {
        int sum=0;
        int t=n;
        while(n>0)
        {
            int r=n%10;
            sum=sum+r;
            n=n/10;
        }
        if(t%sum==0)
        {
            return 1;
        }
        else{
            return -1;
        }
     } 
     static int factors(int n)
     {
        int s=2;
        for(int i=2;i<=(n/2)+1;i++)
        {
            if(n%i==0)
            {
                s++;
            }
        }
        return s;
     }
    
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("enter no:");
        n=s.nextInt();
        if(p(n)==1 ||p(n)==-1)       {
            System.out.println("not prime");

        }
        else
        {
            System.out.println("prime");
        }
        if(leapyear(n)==1)
        {
            System.out.println("leapyear");
        }
        else{
            System.out.println("not a leap year");
        }
        System.out.println(reverse(n));
        if(harshad(n)==1)
        {
            System.out.println("harshad no");
        }
        else{
            System.out.println("not harshad");
        }
        System.out.println(factors(n));
        s.close();
    }
    
}
