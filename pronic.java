import java.util.Scanner;

public class pronic {
    static  int pronicno(int n)
    { int c=0;
        if(n==2)
        {
            c=1;
            
        }
        else{
            for(int i=0;i<n;i++)
            {
                if(n%2==0)
                {
                    c=-1;
                }
                else 
                {
                    if(i*(i+1)==n)
                    {
                    c=1;
                    }
                }
                }
            }
            return c;
        }


    public static void main(String[] args)
    {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        if(pronicno(n)==1)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
            s.close();
        }
    }
    }
    
