import java.util.Scanner;

public class vowels {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        char  n=s.next().trim().charAt(0);
        int m=n+0;
        
        if((m>=97)&& (m<=122)|| (m>=65) &&(m<90))
        {
    
        if(n=='a' || n=='e' || n=='i' || n=='o' || n=='u' || n=='A' || n=='E'|| n=='I'||n=='O' || n=='U')
        {
            System.out.println("vowels");
        }
        else
        {
            System.out.println("no");
        }
    }
    else
    {
        System.out.println("invalid");
    }

    s.close();
    }
    
}
