import java.util.Scanner;

public class s {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        
        int a1=s.nextInt();
        int a2=s.nextInt();
        
        int t=a1;
        a1=a2;
        a2=t;
        s.nextLine();
        String d=s.nextLine();
        System.out.println(a1+d+a2);
        
        s.close();
    }
    
}
