import java.util.Scanner;
public class foreach2dim {
    public static void main(String[] args)
    {
        int a[][]=new int[3][3];
        int sum=0;
        Scanner s=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++){
                a[i][j]=s.nextInt();
            }
        }
        for(int x[]:a)
        {
            for(int y:x)
            {
                sum+=y;
            }
         System.out.println(sum);  
        }
        s.close();
    }
    
}
