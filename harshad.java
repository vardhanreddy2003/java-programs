import java.util.Scanner;

public class harshad {
    public static void main(String[] args)
    {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        if(harshadno(n)==1)
        {
           System.out.println("harshad");
        }
        else{
            System.out.println("not harshad");
        }
        s.close();
        
    }
    static int harshadno(int n)
    {
        int t=n;
        int sum=0;
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
}
