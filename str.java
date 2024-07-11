public class str {
    public static void main(String[] args)
    {
        String s=" Sai ";
        System.out.println("sai ".startsWith("s"));
        String s1="sai";
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
        String s2=new String("vardhan");
        String s3=new String("vardhan");
        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));
        StringBuilder s4=new StringBuilder("sai");
        System.out.println(s4);
        s4.append("aBB");
        int a=s4.indexOf("a");
        System.out.println(s4);
        System.out.println(a);
        System.out.println(s.toLowerCase());
        
        

    }
    
}
