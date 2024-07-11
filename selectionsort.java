import java.util.Scanner;

public class selectionsort {
   static void sort(int a[])
   {
    for(int i=0;i<a.length-1;i++)
    {
        for(int j=i;j<a.length;j++)
        {
           if(a[j]<a[i])
           {
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
           } 
        }
    }
    for(int i=0;i<5;i++)
    {
    System.out.println(a[i]);
    }

   } 
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
            a[i]=s.nextInt();
        }
        sort(a);
        s.close();
    }
}
