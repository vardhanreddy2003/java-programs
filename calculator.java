import java.util.Scanner;

public class calculator {
    
    public static void main(String[] args)
    {
        int result=0;
        Scanner s=new Scanner(System.in);
        while(true)
        {
           int a=s.nextInt();
           int b=s.nextInt();
           char  op=s.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%')
            {
                if(op=='+')
                {
                    result=a+b;
                }
                 if(op=='-')
                {
                    result=a-b;
                } if(op=='*')
                {
                    result=a*b;
                } if(op=='/')
                {
                    if(b==0){
                        System.out.println("denominator is zero");
                    }
                    else{
                    result=a/b;
                    }
                }if(op=='%')
                    {
                        if(b==0){
                            System.out.println("denominator is zero");
                        }
                        else{
                        result=a%b;
                        }
                   }
                }
            
        
        
        else if(op=='x'||op=='X')
        {
          break;
        }
        else{
            System.out.println("invalid operator");
        }
        System.out.println(result);
    }
    s.close();
}
}
