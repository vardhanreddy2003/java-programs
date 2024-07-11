public class linrec {
    static int p(int a[],int p,int i)
    {
        if(i==a.length)
        {
            return -1;
        }
        else{
            if(a[i]==p)
            {
                return i;
            }
            else{
                return p(a,p,i+1);
            }
        }
    }
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5};
        System.out.println(p(a,5,0));
    }
    
}
