import java.util.Scanner;
public class Foreach {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[12];
        int sum=0;
        for(int i=0;i<12;i++)
        {
            System.out.print("enter no:");
            a[i]=s.nextInt();
        }
    for(int x:a){
        sum+=x;

    }
    System.out.println(sum);
    s.close();
    }
    
}
