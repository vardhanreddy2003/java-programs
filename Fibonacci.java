public class Fibonacci {
    static int fib(int n,int a,int b)

    {
        int c=a+b;
        if(c%2==0)
        {
            n--;
        }
        if(n==0)
        {
            return c;
        }
        else{
            return fib(n,b,c);
        }

    }
    public static void main(String[] args)
    {
        int n=5;
        System.out.println(fib(n,1,1));
    }
    
}
