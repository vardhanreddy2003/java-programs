import java.util.Scanner;

public class factors {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        int c=0;
        for(int i=1;i<=(n/2);i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
                c++;
                sum+=i;
            }
        }
        System.out.println(sum+"\n"+c);
        s.close();
    }
    
}
