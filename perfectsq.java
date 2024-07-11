

public class perfectsq {
    static int p(int n,int a)
    {
        if(a*a==n)
        {
            return 1;
        }
        else if(a>(n/2))
        {
            return -1;
        }
        else 
        {
            return p(n,a+1);
        }
    }
    

    public static void main(String[] args)
    {
        int n=11;
        System.out.println(p(n,1));
    }
    
}
