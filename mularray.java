import java.util.Scanner;

public class mularray {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            
            for(int j=0;j<3;j++)
            {
                int k=0;
                for(int m=0;m<3;m++)
                {
                    c[i][j]=a[i][m]+b[m][j];
                }
            }
        }

    }
    
}
