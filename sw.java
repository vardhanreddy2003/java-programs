import java.util.Scanner;

public class sw {
    
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        char a=s.next().trim().charAt(0);
        switch(a)
        {
            case '+': int c=s.nextInt();
                     int d=s.nextInt();
                     System.out.println(c+d);break;
            case '-': 
                     int e=s.nextInt();
                     int f=s.nextInt();
                     System.out.println(e-f);break;
            case '*': int g=s.nextInt();
                     int h=s.nextInt();
                     System.out.println(g*h);break;       
            default:System.out.println("invalid");           
            

        }
        s.close();


    }
}
