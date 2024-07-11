import java.util.Scanner;

public class search2darray {
  static int search(int a[][],int s)
  {
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a[i].length;j++)
        {
            if(a[i][j]==s)
            {
                return 1;
            }
            
        }
    }
    return 0;
  }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int[][] a=new int[3][3];
        int se=s.nextInt();
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        int re=search(a,se);
        if(re==1)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        s.close();
    }
}
