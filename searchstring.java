import java.util.Scanner;

public class searchstring {
    static int search(String s,char a)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==a)
            {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        char a=s.next().charAt(0);
        int b=search(str,a);
        if(b==1)
        {
            System.out.print("yes");

        }
        else{
            System.out.print("no");
        }
        s.close();
    }
    
}
