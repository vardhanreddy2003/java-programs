public class primere {
    static int p(int n,int i)
    {
        if(n==1)
        {
            return -1;
        }
        else
        {
        if(i==1)
        {
            return 1;
        }
        else
        {
            if(n%i==0)
            {
                return 0;
            }
            else{
                return p(n,i-1);
            }
        }
    }
    }
    public static void main(String[] args)
    {
        int n=1;
        System.out.println(p(n,n/2));
    }
    
}
