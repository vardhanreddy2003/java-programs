public class charvariable {
    public static void main(String[] args)
    {
       int a= fun(2,4,6);
       System.out.println(a);
    }
    static int fun(String ...v)
    {
        return 21;
    }
    static int fun(int ...v)
    {
        return 2;
    }
}
