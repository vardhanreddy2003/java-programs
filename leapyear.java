import java.util.Scanner;

public class leapyear {
    static int leap(int n)
    {
        if(n%400==0 ||(n%4==0 &&n%100!=0))
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
        int a=s.nextInt();
        if(leap(a)==1)
        {
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
        }
        s.close();
    }    
}
