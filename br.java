public class br {
    public static void main(String[] args)
    {
        int i=0;
        while(true)
        {
            if(i>6)
            {
                break;
            }
            if(i==4 || i==8)
            {
            
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
    
}
