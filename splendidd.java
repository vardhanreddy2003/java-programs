import java.util.Scanner;

public class splendidd {
    static int re(int n)
    {
        int sum=0;
       while(n>0)
       {
        int r=n%10;
        sum=sum+(r*r);
        n=n/10;
       } 
       return sum;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>9)
        {
            if(n>9)
            {
                n=re(n);
            }
        }
        if(n==1)
        {
            System.out.println("splendid");
        }
        if(n==4){
            System.out.println("sorrowful");
        }
        s.close();
    }
}
