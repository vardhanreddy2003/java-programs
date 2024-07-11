import java.util.Scanner;

public class palin {
    static String palindrome(String  s)
    {
        int c=0;
        int l=s.length();
        int x=l-1;
        for(int i=0;i<=l/2;i++)
        {
            if(s.charAt(i)!=s.charAt(x))
            {
                c=1;
                break;
            }
            x=x-1;
        }
        if(c==0)
        {
            return "yes";
        }
        else
        {
            return "no";
        }
        }

        public static void main(String[] args)
        {
            Scanner s= new Scanner(System.in);
            String st;
            st=s.next(); 
            System.out.println(palindrome(st));
            s.close();
        }
    }
    
    

