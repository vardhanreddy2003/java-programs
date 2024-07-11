import java.util.Scanner;


public class cyclic {
    public static void main(String[] args)
    {

    Scanner s=new Scanner(System.in);
   int a=s.nextInt();
   int b=s.nextInt();
   int c=s.nextInt();
   int  d=s.nextInt();
   if(a+c==180 && b+d==180)
   {
    System.out.println("yes");
   }
    
    else {
        System.out.println("no");
    }
    s.close();
    }
}  

