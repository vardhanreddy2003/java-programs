import java.util.Scanner;

public class linearsearch {
    static int lisearch(int l,int a[])
    {
        for(int i=0;i<a.length;i++)
        {
        if(a[i]==l)
        {
            return i;
        }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int search=s.nextInt();
        int n=s.nextInt();

        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int k=lisearch(search,a);
        if(k==-1)
        {
            System.out.println("element is not present");
        }
        else
        {
            System.out.println(k+1);

        }
        s.close();

        
    }
    
}
