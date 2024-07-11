import java.util.Scanner;

public class swit {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        char  role=s.next().trim().charAt(0);
        int  a=1;
        int b=2;
        int  result=switch (role) {
            case '+'->a+b;
            case '-'->a-b;
            default->
            {
                System.out.println("a");
                yield -1;
                
            }

        };
        System.out.println(result);
s.close();
    }
    
}
