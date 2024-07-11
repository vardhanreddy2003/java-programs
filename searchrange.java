import java.util.Scanner;

public class searchrange {

    static int rnge(int a[],int s,int e,int search)
    {
        for(int i=s;i<e;i++)
        {
            if(a[i]==search)
            {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      int[] a=new int[5];
      int st=s.nextInt();
      int e=s.nextInt();
      int se=s.nextInt();
      for(int i=0;i<5;i++)
      {
        a[i]=s.nextInt();
      }
      int b=rnge(a,st,e,se);
      if(b==1)
      {
        System.out.println("yes");
      }
      else{
        System.out.println("NO");
      }
      s.close();

    }

    
}
