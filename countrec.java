public class countrec {
    static int p(int n,int c)
    {
        if(n==0)
        {
            return c;
        }
        else{
            if(n%10==0)
            {
                c=c+1;
            }
            return p(n/10,c);
        }
    }
    public static void main(String[] args)
    {
        int n=102001;
        System.out.println(p(n,0));
    }
    
}
