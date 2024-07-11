import java.util.Scanner;

public class switches {
    
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        
            String a=s.next();
            int u =s.nextInt();
            switch(a)
            {
                case "mon":
                switch(u){
                    case 1:System.out.println("ac"); break;
                    default:System.out.println("ammc"); 

                }break;
                case "tue":
                case "wed":
                case "thurs":
                case "fri": System.out.println("weekday"); break;
                case "sat":
                case "sun":System.out.println("weekend"); break;
                default:System.out.println("invalid");
            }
            s.close();
            }
            }
        
    

