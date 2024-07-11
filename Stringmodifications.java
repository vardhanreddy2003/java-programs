import java.util.Arrays;

public class Stringmodifications {
    
    public static void main(String[] args)
    {
        String s="vIgnan@123";
       String str=s.toLowerCase();
    
        int a[]=new int[26];
        for(int i=0;i<str.length();i++)
        {
            int m=(int)str.charAt(i)-97;
            if(m>=0 &&m<=26)
            {
                a[m]+=1;
            }
        }
        for(int i=0;i<str.length();i++)
        {
        
            int m=(int)str.charAt(i)-97;
            if(m>=0 &&m<=26)
            {
                System.out.println(str.charAt(i)+"->"+a[m]);
        }
        System.out.println("------");
        for(int j=0;j<a.length;j++)
        {
            if(a[j]>0)
            {
                System.out.println((char)(j+97)+"->"+a[j]);
            }
        }
        

    
    
        
    }
    
}
}


