import java.util.Scanner;

public class sample {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=9,b=3;
        a=a--;
        b=b--;
        System.out.println(a);
        System.out.println(b);
        //post increment will not be work on same variable

        s.close();
    }
    
}
