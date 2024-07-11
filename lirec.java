import java.util.ArrayList;

public class lirec {
    static ArrayList<Integer> p(int[] a,int p,int i,ArrayList<Integer> l)
    {
        if(i==a.length)
        {
            return l;
        }
        else{
            if(a[i]==p)
            {
                l.add(i);
            }
            
                return p(a,p,i+1,l);
    
        }
    }
    public static void main(String[] args)
    {
        int a[]={1,2,3,2,4,5};
        ArrayList<Integer> l=new ArrayList<Integer>();
        System.out.println(p(a,5,0,l));
    }

    
}
