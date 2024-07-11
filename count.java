import java.util.Scanner;

public class count {
    public static void main(String[] args)
    {
        int count=0;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>0){
            int r=n%10;
            if(r==7){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
        s.close();
    }
    
}
