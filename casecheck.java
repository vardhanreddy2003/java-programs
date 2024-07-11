import java.util.Scanner;

public class casecheck {
 

public static void main(String[] args)
 {
    Scanner input= new Scanner(System.in);
    char a=input.next().trim().charAt(0);
    if(a >= 'a' && a <='z')
    {
        System.out.println("lower");

    }
    else
    {
        System.out.println("upper");

    }
    input.close();
 }

 
}
