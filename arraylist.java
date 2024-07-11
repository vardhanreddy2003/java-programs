import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(20);
        
        for(int i=0;i<10;i++)
        {
            list.add(s.nextInt());
        }
        list.set(0,99);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.contains(20));
        for(int j=0;j<5;j++)
        {
            System.out.println(list.get(j));
        }
        
        
        s.close();

    }
    
}
