import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        
        int[] a= new int[10];
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        int[] b=new int[10];
        for(int j=a.length-1;j>=0;j--)
        {
            b[j]=a[a.length-1-j];
        }
        System.out.println(Arrays.toString(b));
        s.close();
    }
    
}
