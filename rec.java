public class rec {
    static int p(int n,int a)
    {
        
        if(n==0)
        {
            return a;
        }
        else{
            a+=n;
            return p(n-1,a);
        }
    }
    public static void main(String[] args)
    {
        System.out.println(p(6,0));
    }
    
}
