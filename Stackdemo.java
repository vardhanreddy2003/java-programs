import java.util.Stack;

public class Stackdemo {
    public static void main(String[] args)
    {
        Stack<Character>st=new Stack<Character>();
		//String s="(a+b)*c";
		//int i=0;
        
		// while(i<s.length())
		// {
		// 	if(s.charAt(i)=='(')
		// 	{
                
		// 		st.push(s.charAt(i));
        //         i++;
		// 	}
		// 	else if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*')
		// 	{
		// 		st.push(s.charAt(i));
        //         i++;
		// 	}
		// 	else if(s.charAt(i)==')')
		// 	{
		// 		while(st.peek()!='(')
		// 		{
		// 			char c=st.pop();
		// 			System.out.println(c);
		// 		}
		// 		st.pop();
        //         i++;
		// 	}
		// 	else
		// 	{
		// 		System.out.println(s.charAt(i));
        //         i++;
		// 	}
			
		// }
	
		// while(st.peek()==-1)
		// {
		// 	char c=st.pop();
		// 	System.out.println(c);
		// }
       // System.out.println(st.peek());
        String x="ab+b+";
        int i=0;
        while(i<x.length())
        {
            if(x.charAt(i)>='a'&& x.charAt(i)<='z')
            {
                st.push(x.charAt(i));
                i++;
                
            }
            if(x.charAt(i)=='+')
            {
                int a=0;
                int b=0;
                int a1=st.pop();
                int a2=st.pop();
                if(a1=='b')
                {
                     b=2;

                }
                if(a2=='a')
                {
                     a=1;
                    
                }
                char c=(char)(a+b);
                
                st.push(c);
            i++;
            }
        
        
    }
    
    
}
}
