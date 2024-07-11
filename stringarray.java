import java.util.Scanner;

public class stringarray {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String[] str=new String[5];
        for(int i=0;i<5;i++)
        {
            str[i]=s.next();
        }
        for(String sw:str){
            System.out.println(sw);
        }
s.close();
    }
    
}
