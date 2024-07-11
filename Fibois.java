

public class Fibois {
    static int p(int n,int a,int b)
    {
        if(a+b==n)
        {
            return 1;
        }
        else if(a+b>n)
        {
            return 0;
        }
        else 
        {
            return p(n,b,a+b);
        }
        }
    
    public static void main(String[] args)
    {
        System.out.println(p(9,0,1));
    }
    }
    

