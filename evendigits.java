import java.util.ArrayList;
import java.util.Scanner;

public class evendigits {
   
    static int sum(int n)
    {
        int c=0;
        while(n>0)
        {
            c=c+1;
            n=n/10;
        }
        if(c%2==0)
        {
            return 1;
        }
        else{
            return 0;
        }
        
    }
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      int [] a=new int [4];
      for(int i=0;i<4;i++)
      {
        a[i]=s.nextInt();
      }
      ArrayList<Integer> b=new ArrayList<Integer>();
      ArrayList<Integer> c=new ArrayList<>();
    
      for(int j=0;j<a.length;j++)
      {
        if(a[j]%2==0)
        {
          b.add(a[j]);
        }
        else{
          c.add(a[j]);
        }
      }
      System.out.println(c);
      System.out.println(b);
    }
    
}
