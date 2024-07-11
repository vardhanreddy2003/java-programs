import java.util.Scanner;

public class maxarr {
    public static void main(String[] args)
    {
        
        Scanner s=new Scanner(System.in);
        int a[][]=new int[3][3];
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            int sum=a[i][0];
            for(int j=0;j<3;j++)
            {
                if(sum<a[i][j])
                {
                    sum=a[i][j];
                }
            }
            System.out.println(i+"="+sum);
        }
        s.close();
    }
    
}
